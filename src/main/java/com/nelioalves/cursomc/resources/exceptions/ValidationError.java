package com.nelioalves.cursomc.resources.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {
	private static final long serialVersionUID = 1L;
	
	private List<FieldMessage> errors = new ArrayList<>();
	
	//Constructor
	public ValidationError(Integer error, String msg, Long timeStamp) {
		super(error, msg, timeStamp);
	}

	public List<FieldMessage> getErrors() {
		return errors;
	}

	public void addError(String fieldName, String mensagem) {
		errors.add(new FieldMessage(fieldName, mensagem));
	}


	
	
	
}
