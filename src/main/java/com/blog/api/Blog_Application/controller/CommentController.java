package com.blog.api.Blog_Application.controller;

import com.blog.api.Blog_Application.entities.Comment;
import com.blog.api.Blog_Application.payloads.ApiResponse;
import com.blog.api.Blog_Application.payloads.CommentDto;
import com.blog.api.Blog_Application.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")//To Get the Comments Users Post about the Post
public class CommentController {
    @Autowired
    private CommentService commentService;

    @PostMapping("/post/{postId}/comments")
    public ResponseEntity<CommentDto> createComment(@RequestBody CommentDto comment,@PathVariable Integer postId){

       CommentDto createComment = this.commentService.createComment(comment,postId);
       return new ResponseEntity<CommentDto>(createComment, HttpStatus.CREATED);
    }

    //Delete Mapping is used to Delete the Comments
    @DeleteMapping("/comments/{commentId}")
    public ResponseEntity<ApiResponse> deleteComment(@PathVariable Integer commentId){

        this.commentService.deleteComment(commentId);

        return new ResponseEntity<ApiResponse>(new ApiResponse("Comment Deleted Successfully!!",true), HttpStatus.OK);
    }

}
