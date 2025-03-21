package com.blog.api.Blog_Application.service;

import com.blog.api.Blog_Application.payloads.UserDto;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto user);
    UserDto updateUser(UserDto user, Integer userId);
    UserDto getUserById(Integer userId);
    List<UserDto> getAllUsers();

    boolean deleteUser(Integer userId);
}
