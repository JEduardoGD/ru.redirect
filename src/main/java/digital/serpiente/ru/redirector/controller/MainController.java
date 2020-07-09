package digital.serpiente.ru.redirector.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import digital.serpiente.ru.redirector.apiservice.MainService;

@RestController
public class MainController {
	
	@Autowired
	private MainService mainService;

	@GetMapping("/{callsign}")
	void getRedirectForCallsign(@PathVariable String callsign, HttpServletRequest request, HttpServletResponse httpServletResponse) {
		mainService.getRedirectForCallsign(callsign, request, httpServletResponse);
	}
}
