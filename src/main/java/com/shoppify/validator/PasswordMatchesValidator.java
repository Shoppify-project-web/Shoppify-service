package com.shoppify.validator;

import com.shoppify.dto.payload.request.RegisterRequest;
import com.shoppify.entity.PasswordAndConfirmPassword;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.stereotype.Component;

@Component
public class PasswordMatchesValidator implements ConstraintValidator<PasswordValidator,PasswordAndConfirmPassword> {
    @Override
    public void initialize(PasswordValidator constraintAnnotation) {
    }

    @Override
    public boolean isValid(PasswordAndConfirmPassword request, ConstraintValidatorContext context) {
        return request.getCurrentPassword().equals(request.getConfirmPassword());

    }
}
