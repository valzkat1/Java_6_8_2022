package org.fundacionview.validaciones;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class ConfiguracionBeans {

	@Bean
	public MessageSource messageSource() {
		
		ResourceBundleMessageSource misRecursos=new ResourceBundleMessageSource();
		misRecursos.addBasenames("messages");
		 
		return misRecursos;
		
		
	}
	
	
}
