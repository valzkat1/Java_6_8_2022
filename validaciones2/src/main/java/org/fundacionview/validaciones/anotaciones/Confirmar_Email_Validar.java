package org.fundacionview.validaciones.anotaciones;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.fundacionview.validaciones.modelos.Persona;

public class Confirmar_Email_Validar implements ConstraintValidator<Confirmar_Email, Persona>{

	@Override
	public boolean isValid(Persona value, ConstraintValidatorContext context) {
		
		if(value.getEmail().equals(value.getConfirmaremail())) {
			return true;
		}else {
		// TODO Auto-generated method stub
			context.disableDefaultConstraintViolation();
			context.buildConstraintViolationWithTemplate(context.getDefaultConstraintMessageTemplate())
			.addNode("confirmaremail")
			.addConstraintViolation();
			
			
		return false;
		
		
		}
	}

}
