package com.crud.springboot.app.springboot_crud.validation;

import com.crud.springboot.app.springboot_crud.services.ProductService;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class IsExistsDbValidation implements ConstraintValidator<IsExistsDb, String> {

    private final ProductService productService;

    public IsExistsDbValidation(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public boolean isValid(String arg0, ConstraintValidatorContext arg1) {

        if (productService == null) {
            return true;
        }
        return !productService.existsBySku(arg0);
    }

}
