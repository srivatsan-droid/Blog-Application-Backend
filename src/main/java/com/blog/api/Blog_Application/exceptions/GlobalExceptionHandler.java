package com.blog.api.Blog_Application.exceptions;

import com.blog.api.Blog_Application.payloads.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

//If we Encounter an Exception then for all the controller we can handle the Exceptions of Type REST
@RestControllerAdvice
public class GlobalExceptionHandler {

    //Resouce Not Found Exception is a Custom Exception to Handle invalid Exception which is used by user
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse> resourceNotFoundException(ResourceNotFoundException ex) {
        String message = ex.getMessage();
        ApiResponse response = new ApiResponse(message, true); // ✅ Use ApiResponse directly
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND); // ✅ Use HttpStatus directly
    //Whenever we encounter an Exception where user id not found Exception where this Method will handle this Exception
    }
    //To Handle User Validation Exception say we have a user who is entering a wrong User name and password
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String,String>> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex){
        Map<String,String> resp = new HashMap<>();
        //To indicate the user that the request is not valid
        ex.getBindingResult().getAllErrors().forEach((error)->{
            String fieldName = ((FieldError) error).getField(); //To get the field name which is not valid
            String message = error.getDefaultMessage(); //To get the message of the error
            resp.put(fieldName,message);
        });
        return new ResponseEntity<Map<String,String>>(resp,HttpStatus.BAD_REQUEST);
    }


}
