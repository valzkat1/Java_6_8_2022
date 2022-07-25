package org.fundacionview.sgsst.seguridad;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

@Retention(RUNTIME)
public @interface PermissionCheck {

	
	public String[] workspace() default {};
	
	public boolean read() default false;
	
	public boolean write() default false;
	
	public boolean delete() default false;
	
	
}
