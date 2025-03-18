package com.blog.api.Blog_Application.payloads;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
    private int id;

    @NotEmpty(message = "Name cannot be empty")
    @Size(min=4,message = "Name should have at least 4 characters")
    private String name;

    @Email(message = "Invalid email format")
    private String email;

    @NotBlank(message = "Password cannot be empty")
    @Size(min=2,max=10,message = "Password should be between 8 and 16 characters")
    private String password;

    @NotBlank(message = "About cannot be empty")
    private String about;
}
