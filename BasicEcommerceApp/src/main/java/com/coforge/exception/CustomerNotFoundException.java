package com.coforge.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class CustomerNotFoundException extends RuntimeException {
	
	public ResponseEntity<String> CustomerNotFoundException(String exp) {
		return new ResponseEntity<>("Customer Not Found",HttpStatus.NOT_FOUND);
	}

}
