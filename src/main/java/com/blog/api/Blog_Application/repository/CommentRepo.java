package com.blog.api.Blog_Application.repository;

import com.blog.api.Blog_Application.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepo extends JpaRepository<Comment, Integer> {
}
