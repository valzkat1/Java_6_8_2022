package org.fundacionview.validaciones.anotaciones;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class Indicativo_Colombia_Validar implements ConstraintValidator<Indicativo_Colombia, String>{

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		
		if(value.indexOf("+57")==0) {
			return true;
		}else
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
