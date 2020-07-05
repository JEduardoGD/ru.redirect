package digital.serpiente.ru.redirector.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import digital.serpiente.ru.redirector.dto.RequestDTO;
import digital.serpiente.ru.redirector.persistence.entity.RequestLog;
import digital.serpiente.ru.redirector.persistence.repository.RequestRedirectRepository;
import digital.serpiente.ru.redirector.persistence.repository.RequestRepository;
import digital.serpiente.ru.redirector.util.CallsignSanitize;
import digital.serpiente.ru.redirector.util.ProcessRequestUtil;

@RestController
public class MainController {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private RequestRepository requestRepository;

	@Autowired
	private RequestRedirectRepository requestRedirecttRepository;

	@GetMapping("/{callsign}")
	void all(@PathVariable String callsign, HttpServletRequest request, HttpServletResponse httpServletResponse) {
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
