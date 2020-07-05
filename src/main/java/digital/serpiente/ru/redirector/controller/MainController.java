package digital.serpiente.ru.redirector.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/{callsign}")
	void all(@PathVariable String callsign,
			HttpServletRequest request,
			HttpServletResponse httpServletResponse) {
	    httpServletResponse.setHeader("Location", "http://www.yahoo.com");
	    httpServletResponse.setStatus(302);
	}
}
