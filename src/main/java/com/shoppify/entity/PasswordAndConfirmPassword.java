package com.shoppify.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PasswordAndConfirmPassword {
    private String currentPassword;
    private String confirmPassword;
}
