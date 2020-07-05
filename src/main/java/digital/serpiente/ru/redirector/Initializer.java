package digital.serpiente.ru.redirector;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Initializer {
	@Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}
}
