package com.blog.api.Blog_Application.service.impl;

import com.blog.api.Blog_Application.entities.Comment;
import com.blog.api.Blog_Application.entities.Post;
import com.blog.api.Blog_Application.exceptions.ResourceNotFoundException;
import com.blog.api.Blog_Application.payloads.CommentDto;
import com.blog.api.Blog_Application.repository.CommentRepo;
import com.blog.api.Blog_Application.repository.PostRepo;
import com.blog.api.Blog_Application.service.CommentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private PostRepo postRepo;

    @Autowired
    private CommentRepo commentRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CommentDto createComment(CommentDto commentDto, Integer postId) {

        //Create Comment
        Post post = this.postRepo.findById(postId).orElseThrow(() -> new ResourceNotFoundException("Post","postId",postId));
        Comment comment = this.modelMapper.map(commentDto, Comment.class);
        comment.setPost(post);
        Comment savedComment = this.commentRepo.save(comment);
        return this.modelMapper.map(savedComment,CommentDto.class);
    }

    @Override
    public void deleteComment(Integer commentId) {

        Comment com = this.commentRepo.findById(commentId)
                .orElseThrow(() -> new ResourceNotFoundException("Comment", "Comment Id", commentId));
        this.commentRepo.delete(com);
    }
}
