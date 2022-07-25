package org.fundacionview.sgsst.seguridad;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.LoginUrlAuthenticationEntryPoint;

@Configuration
@EnableWebSecurity
public class Configuracion extends WebSecurityConfigurerAdapter{

	private static final String[] paginasNoFiltradas= new String[] {"/","/login","/js/**","/css/**"};
	
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public LoginUrlAuthenticationEntryPoint createDelegateAuthEntryPoint() {
		return new LoginUrlAuthenticationEntryPoint("/");
	}
	
	@Bean
	public UserDetailsService crearUser() {
		return new SecurityUserDetailsService();
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth)throws Exception {
		auth.userDetailsService(crearUser()).passwordEncoder(passwordEncoder());
		
	}
		
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests()
		.antMatchers(paginasNoFiltradas).permitAll()
		.anyRequest().fullyAuthenticated()
		.and()
		.exceptionHandling().authenticationEntryPoint(createDelegateAuthEntryPoint())
		.accessDeniedPage("/sinPermisos")
		.and()
		.formLogin()
		.loginPage("/")
		.loginProcessingUrl("/login")
		.defaultSuccessUrl("/home")
		.permitAll()
		.and()
		.rememberMe()
		.and()
		.csrf();
	}
	
}
