package com.blog.api.Blog_Application.repository;

import com.blog.api.Blog_Application.entities.Category;
import com.blog.api.Blog_Application.entities.Post;
import com.blog.api.Blog_Application.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

//Getting the Data for this method where we are getting the data of the post where the value of the type post is an integer
public interface PostRepo extends JpaRepository<Post, Integer> {

    List<Post> findAllByUser(User user);//Getting the data of the post where the value of the type category is an integer
    List<Post> findAllByCategory(Category category);//Getting the data of the post where the value of the type category is an integer

    @Query("select p from Post p where p.title like :key")
    List<Post> searchByTitle(@Param("key") String title);


}
