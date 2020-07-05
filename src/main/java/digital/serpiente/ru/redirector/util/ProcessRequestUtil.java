package digital.serpiente.ru.redirector.util;

import javax.servlet.http.HttpServletRequest;

import digital.serpiente.ru.redirector.dto.RequestDTO;

public final class ProcessRequestUtil {
	public static RequestDTO process(HttpServletRequest request) {
		return new RequestDTO(
				request.getRemoteAddr(),
				request.getRequestURL().toString(),
				request.getRequestURI(),
				DateTimeUtil.getUtcTime());
	}
}
