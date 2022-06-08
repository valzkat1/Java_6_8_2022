package org.fundacionview.xmlbeans;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class ConfiguracionBeans {

	
	
	@Bean
	public MessageSource messageSource() {
		
		ResourceBundleMessageSource recursosMensajes=new ResourceBundleMessageSource();
		recursosMensajes.addBasenames("messages");
		return recursosMensajes;
		
		
		
	}
	
	
	
}
