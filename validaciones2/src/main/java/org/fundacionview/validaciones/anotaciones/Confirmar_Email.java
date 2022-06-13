package org.fundacionview.validaciones.anotaciones;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RUNTIME)
@Target(TYPE)
@Constraint(validatedBy = Confirmar_Email_Validar.class)
public @interface Confirmar_Email {

	public String value() default "";
	
	public String message() default "Los campos de email deben coincidir";
	
	public Class<?>[] groups() default {};
	
	public Class<? extends Payload>[] payload() default {};
	
	
}
