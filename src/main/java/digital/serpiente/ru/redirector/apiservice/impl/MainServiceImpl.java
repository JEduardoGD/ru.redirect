package digital.serpiente.ru.redirector.apiservice.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import digital.serpiente.ru.redirector.apiservice.MainService;
import digital.serpiente.ru.redirector.dto.RequestDTO;
import digital.serpiente.ru.redirector.persistence.entity.RequestLog;
import digital.serpiente.ru.redirector.persistence.repository.RequestRedirectRepository;
import digital.serpiente.ru.redirector.persistence.repository.RequestRepository;
import digital.serpiente.ru.redirector.util.CallsignSanitize;
import digital.serpiente.ru.redirector.util.ProcessRequestUtil;

@Service
public class MainServiceImpl implements MainService {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private RequestRepository requestRepository;

	@Autowired
	private RequestRedirectRepository requestRedirecttRepository;

	@Override
	public void getRedirectForCallsign(String callsign, HttpServletRequest request,
			HttpServletResponse httpServletResponse) {
		RequestDTO requestDto = ProcessRequestUtil.process(request);
		RequestLog requestLog = modelMapper.map(requestDto, RequestLog.class);
		requestRepository.save(requestLog);

		String callsignFromUri = CallsignSanitize.sanitizeCallsign(requestDto.getUri());
		String redirect = requestRedirecttRepository.getActiveRedirectFor(callsignFromUri);

		if (redirect == null) {
			httpServletResponse.setStatus(404);
		}
		httpServletResponse.setHeader("Location", redirect);
		httpServletResponse.setStatus(302);
	}
}
