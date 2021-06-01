package com.example.crud.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class CustomException extends Exception{

    @Override
    public String getMessage(){
        return "Custom Exception thrown!";
    }

}
