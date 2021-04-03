package digital.serpiente.ru.redirector;

import org.h2.server.web.WebServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;

public class WebConfiguration {
    ServletRegistrationBean h2servletRegistration(){
        @SuppressWarnings({ "rawtypes", "unchecked" })
		ServletRegistrationBean registrationBean = new ServletRegistrationBean( new WebServlet());
        registrationBean.addUrlMappings("/console/*");
        return registrationBean;
    }
}
