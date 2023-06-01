package com.pruebatecnica.sanitas.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CalculadoraExceptionHandler {

    @ExceptionHandler(OperationInvalidException.class)
    public ResponseEntity<String> handleOperacionInvalidaException(OperationInvalidException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }

    @ExceptionHandler(TypeOperationInvalidException.class)
    public ResponseEntity<String> handleTypeOperacionInvalidaException(TypeOperationInvalidException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }
}
