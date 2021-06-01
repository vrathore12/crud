package com.example.crud.validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidNameValidator implements ConstraintValidator<ValidName, String> {

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if(s.matches("[0-9a-z]+")){
            return true;
        }else{
            return false;
        }
    }
}
