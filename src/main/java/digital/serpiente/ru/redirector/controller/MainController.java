package digital.serpiente.ru.redirector.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/{callsign}")
	void all(@PathVariable String callsign, HttpServletResponse httpServletResponse) {
		System.out.println(callsign);
		

	    httpServletResponse.setHeader("Location", "http://www.yahoo.com");
	    httpServletResponse.setStatus(302);
	}
}
