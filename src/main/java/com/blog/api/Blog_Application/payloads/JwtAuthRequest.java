package com.blog.api.Blog_Application.payloads;

import lombok.Data;

@Data
public class JwtAuthRequest {

    private String username;  // email only

    private String password;

}
