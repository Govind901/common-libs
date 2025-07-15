package com.dropx.commons.customannotation.validation;

import com.dropx.commons.customannotation.NotBlankOrNull;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class NullBlankValidator implements ConstraintValidator<NotBlankOrNull,String>{

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return s != null && !s.trim().isEmpty();
    }
}
