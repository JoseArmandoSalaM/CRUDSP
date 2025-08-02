package com.crud.springboot.app.springboot_crud.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy = ExitsByUserNameValidation.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ExitsByUserName {
    String message() default "Ya existe en la bd, escoja otro username";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
