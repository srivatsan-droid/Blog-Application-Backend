package com.blog.api.Blog_Application.service;

import com.blog.api.Blog_Application.payloads.ApiResponse;
import com.blog.api.Blog_Application.payloads.CommentDto;

public interface CommentService {

    CommentDto createComment(CommentDto commentDto,Integer postId);
    void deleteComment(Integer commentId);
}
