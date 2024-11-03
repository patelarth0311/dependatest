package com.example.springboot.validator;

import org.springframework.validation.annotation.Validated;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class NameValidator implements ConstraintValidator<NameRequirement, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        
        if (value.length() <= 5) {
            return false;
        }


        return true;
    } 
    
}
