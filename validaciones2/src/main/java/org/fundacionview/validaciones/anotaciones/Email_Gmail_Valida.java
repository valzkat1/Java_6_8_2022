package org.fundacionview.validaciones.anotaciones;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class Email_Gmail_Valida implements ConstraintValidator<Email_Gmail, String>{

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		
		if(value.endsWith("@gmail.com")) {
			
			return true;
		}else {
		
		
		// TODO Auto-generated method stub
		return false;
		}
	}

}
