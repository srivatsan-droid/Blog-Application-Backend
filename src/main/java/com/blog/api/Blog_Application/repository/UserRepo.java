package com.blog.api.Blog_Application.repository;

import com.blog.api.Blog_Application.entities.User;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

//Processing the Data we pass from the Client
public interface UserRepo extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);
}
