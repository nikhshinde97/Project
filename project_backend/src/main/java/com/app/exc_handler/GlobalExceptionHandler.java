package com.app.exc_handler;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.app.dto.ErrorResponse;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{
    
	@ExceptionHandler
	public ResponseEntity<?> handleRuntimeException(RuntimeException e){
		ErrorResponse resp = new ErrorResponse("Account not created", LocalDateTime.now());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(resp);
	}
}
