package digital.serpiente.ru.redirector.apiservice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface MainService {

	void getRedirectForCallsign(String callsign, HttpServletRequest request, HttpServletResponse httpServletResponse);

}
