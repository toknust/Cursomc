package com.knustthomas.cursomc.resources.exeption;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.knustthomas.cursomc.services.exeptions.DataIntegrityExeption;
import com.knustthomas.cursomc.services.exeptions.ObjectNotFoundExeption;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(ObjectNotFoundExeption.class)
	public ResponseEntity<StandardError> objectNorFound(ObjectNotFoundExeption e, HttpServletRequest request) {
		
		StandardError err = new StandardError(e.getMessage(), HttpStatus.NOT_FOUND.value(), System.currentTimeMillis());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
		
	}

	@ExceptionHandler(DataIntegrityExeption.class)
	public ResponseEntity<StandardError> dataintegrity(DataIntegrityExeption e, HttpServletRequest request) {
		
		StandardError err = new StandardError(e.getMessage(), HttpStatus.BAD_REQUEST.value(), System.currentTimeMillis());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(err);
		
	}
}
