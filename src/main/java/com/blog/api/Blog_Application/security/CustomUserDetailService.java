package com.blog.api.Blog_Application.security;

import com.blog.api.Blog_Application.entities.User;
import com.blog.api.Blog_Application.exceptions.ResourceNotFoundException;
import com.blog.api.Blog_Application.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.util.Collections;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Load user from the database by username (email in this case)
        User user = this.userRepo.findByEmail(username)
                .orElseThrow(() -> new ResourceNotFoundException("User", "email : " + username, 0));

        // Return a valid UserDetails object
        return user;  // Empty authorities for now, can add roles later
    }
}
