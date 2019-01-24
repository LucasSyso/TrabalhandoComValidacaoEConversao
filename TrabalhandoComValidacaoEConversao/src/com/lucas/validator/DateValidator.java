package com.lucas.validator;

import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("dateValidator")
public class DateValidator implements Validator<Date>{

	@Override
	public void validate(FacesContext context, UIComponent ui, Date dataNasc) throws ValidatorException {
		Date now = new Date(); //Representa o momento atual do sistema
		
		//Se esta exceção não for lançada é algo que o JSF reconhece como sucesso!!
		if(dataNasc != null && dataNasc.after(now)) {
			FacesMessage message = new FacesMessage("A data digitada é maior que a data atual!!");
			throw new ValidatorException(message);
		}
	}

}
