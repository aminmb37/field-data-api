package com.yara.field.controller;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.persistence.EntityNotFoundException;

@ControllerAdvice
public class MvcExceptionHandler {
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<String> entityNotFoundErrorHandler(EntityNotFoundException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<String> constraintViolationErrorHandler(ConstraintViolationException e) {
        return new ResponseEntity<>(e.getMessage() +
                ". Constraint Violated: " + e.getConstraintName(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> generalErrorHandler(Exception e) {
        return new ResponseEntity<>(e.getMessage() + " : " + e.getCause(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
