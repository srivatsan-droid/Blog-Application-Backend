package com.blog.api.Blog_Application.service.impl;

import com.blog.api.Blog_Application.entities.User;
import com.blog.api.Blog_Application.exceptions.ResourceNotFoundException;
import com.blog.api.Blog_Application.payloads.UserDto;
import com.blog.api.Blog_Application.repository.UserRepo;
import com.blog.api.Blog_Application.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public UserDto createUser(UserDto userDto) {
        User user = this.dtoToUser(userDto);
        User savedUser = this.userRepo.save(user);
        return this.userToDto(savedUser);
    }

    //Implements method in UserService (com. blog. api. Blog_Application. service)
    @Override
    public UserDto updateUser(UserDto userDto, Integer userId) {
        //Updating the User Information in the Database
        User user = this.userRepo.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User", " id ", userId));
        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        user.setAbout(userDto.getAbout());
        User updatedUser = this.userRepo.save(user);
        return this.userToDto(updatedUser);
    }

    @Override
    public UserDto getUserById(Integer userId) {
        User user = this.userRepo.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User","Id",userId));
        return this.userToDto(user);
    }

    @Override
    public List<UserDto> getAllUsers() {
        //To fetch all the users present in the DB
        List<User> users = this.userRepo.findAll();
        return users.stream().map(this::userToDto).collect(Collectors.toList());
    }

    @Override
    public boolean deleteUser(Integer userId) {
        User user=this.userRepo.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User","Id",userId));
        this.userRepo.delete(user);
        return false;
    }
    //UserDTO and it Returns User Entity
    public User dtoToUser(UserDto userDto) {
        User user= this.modelMapper.map(userDto, User.class);

//        user.setId(userDto.getId());
//        user.setName(userDto.getName());
//        user.setEmail(userDto.getEmail());
//        user.setPassword(userDto.getPassword());
//        user.setAbout(userDto.getAbout());
        return user;
    }
    //User Entity to Be converted to UserDto
    public UserDto userToDto(User user) {
        UserDto userDto=this.modelMapper.map(user,UserDto.class);
//        userDto.setId(user.getId());
//        userDto.setName(user.getName());
//        userDto.setEmail(user.getEmail());
//        userDto.setPassword(user.getPassword());
//        userDto.setAbout(user.getAbout());
        return userDto;
    }
}
