package com.blog.api.Blog_Application.repository;

import com.blog.api.Blog_Application.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

//To Perform DB Operations
public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
