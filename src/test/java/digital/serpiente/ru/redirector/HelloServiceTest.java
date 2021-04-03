package digital.serpiente.ru.redirector;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import digital.serpiente.ru.redirector.persistence.entity.RequestLog;
import digital.serpiente.ru.redirector.persistence.repository.RequestRepository;


@SpringBootTest
@AutoConfigureMockMvc
public class HelloServiceTest {
	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	RequestRepository requestRepository;

	@Test
	public void shouldReciveRedirect() throws Exception {
		RequestLog requestLog = new RequestLog();
		requestLog.setDate(new Date());
		requestLog.setRemoteAddress("https://www.att.com.mx/");
		requestLog.setRequestedUrl("/xe1jeg");
		requestRepository.save(requestLog);
		
		this
		.mockMvc.perform(get("/xe1jeg"))
		.andDo(print())
		.andExpect(status().is3xxRedirection());
	}
}
