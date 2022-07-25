package org.fundacionview.sgsst.seguridad;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class SecurityUtil {

	public static SecurityUserDetails getUser() {
		UsernamePasswordAuthenticationToken tokenAutenticacion= (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
		
		if(tokenAutenticacion.getPrincipal() instanceof SecurityUserDetails) {
			return (SecurityUserDetails) tokenAutenticacion.getPrincipal();
		}
		
		return null;
	}
	
	public static int getUserId() {
		SecurityUserDetails user= getUser();
		if(user!=null) {
			return user.getId();
		}
		return 0;
	}
	
	
}
