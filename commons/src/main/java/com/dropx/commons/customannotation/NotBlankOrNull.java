package com.dropx.commons.customannotation;

import com.dropx.commons.customannotation.validation.NullBlankValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Documented
@Constraint(validatedBy = NullBlankValidator.class)
@Target({ElementType.FIELD, ElementType.PARAMETER})
public @interface NotBlankOrNull {
    String message() default "Field must not be null or blank";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
