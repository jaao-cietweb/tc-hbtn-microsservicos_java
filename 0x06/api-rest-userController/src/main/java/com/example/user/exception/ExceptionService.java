package com.example.user.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionService {
    @ExceptionHandler
    ResponseEntity<UserIdException> handleException(UserIdException err){
        UserErrorResponse uer = new UserErrorResponse();
        uer.setStatus(HttpStatus.NOT_FOUND.value());
        uer.setMessage("You have entered ID "+err.getMessage()+" invalid.");
        return new ResponseEntity(uer,HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler
    ResponseEntity<UserNameException> handleException(UserNameException err){
        UserErrorResponse uer = new UserErrorResponse();
        uer.setStatus(HttpStatus.NOT_FOUND.value());
        uer.setMessage("You have entered NAME "+err.getMessage()+" invalid.");
        return new ResponseEntity(uer,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    ResponseEntity<CPFException> handleException(CPFException err){
        UserErrorResponse uer =new UserErrorResponse();
        uer.setStatus(HttpStatus.NOT_FOUND.value());
        uer.setMessage("You have entered CPF "+err.getMessage()+" invalid.");
        return new ResponseEntity(uer,HttpStatus.NOT_FOUND);
    }
}
