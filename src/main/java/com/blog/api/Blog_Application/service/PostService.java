package com.blog.api.Blog_Application.service;

import com.blog.api.Blog_Application.entities.Post;
import com.blog.api.Blog_Application.payloads.PostDto;
import com.blog.api.Blog_Application.payloads.PostResponse;
import org.springframework.data.domain.Page;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto,Integer userId,Integer categoryId);

    Post createPost(PostDto postDto);

    //Update
    PostDto updatePost(PostDto postDto,Integer postId);

    //Delete
    void deletePost(Integer postId);

    //List of Post/Get all Posts

    PostResponse getAllPosts(Integer pageNumber, Integer pageSize,String sortBy,String sortDirection);

    //Get Single Post
    PostDto getPostById(Integer postId);

    //Get All Post By Category
    List<PostDto> getPostsByCategory(Integer categoryId);

    //Get All Post By User
    List<PostDto> getPostsByUser(Integer userId);

    List<PostDto> getAllPostsByCategory(Integer categoryId);

    List<PostDto> getAllPostsByUser(Integer userId);

    //Search Post
    List<PostDto> searchPosts(String keyword);//From the Keyword it will search
}
