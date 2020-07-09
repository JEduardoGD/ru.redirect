package digital.serpiente.ru.redirector;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import digital.serpiente.ru.redirector.controller.MainController;


@AutoConfigureMockMvc
@ContextConfiguration(classes = {MainController.class/*, BasicBirthdayService.class*/})
@WebMvcTest
@SpringBootTest
public class HelloServiceTest {
	@Autowired
	private MockMvc mockMvc;

	@Test
	 private void testStarSign(String birthday, String ss) throws Exception {
	        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/somestring")).andReturn();
	        		/*
	                .with(user(TEST_USER_ID))
	                .with(csrf())
	                .content(birthday)
	                .contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON))
	                .andExpect(status().isOk())
	                .andReturn();*/
	        String resultSS = result.getResponse().getContentAsString();
	        assertNotNull(resultSS);
	        assertEquals(ss, resultSS);
	    }
}
