package com.crud.springboot.app.springboot_crud.validation;

import org.springframework.util.StringUtils;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class RequiredValidation implements ConstraintValidator<IsRequired, String> {

    @Override
    public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
        // if (arg0 != null && arg0.isEmpty() && !arg0.isBlank()) {
        // return true;
        // }

        // return false;

        return StringUtils.hasText(arg0);
    }

}
