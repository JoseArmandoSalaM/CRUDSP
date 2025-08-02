package com.crud.springboot.app.springboot_crud.validation;

import org.springframework.stereotype.Component;

import com.crud.springboot.app.springboot_crud.services.UsersServices;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

@Component
public class ExitsByUserNameValidation implements ConstraintValidator<ExitsByUserName, String> {

    // Relacion
    private final UsersServices usersServices;

    public ExitsByUserNameValidation(UsersServices usersServices) {
        this.usersServices = usersServices;
    }

    @Override
    public boolean isValid(String arg0, ConstraintValidatorContext arg1) {

        return !usersServices.existsByUsername(arg0);
    }

}
