package org.fundacionview.validaciones.anotaciones;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = Indicativo_Colombia_Validar.class)
public @interface Indicativo_Colombia {

	public String value() default "";
	
	public String message() default "Solo numeros de Colombia";
	
	public Class<?>[] groups() default {};
	
	public Class<? extends Payload>[] payload() default{};
	
}
