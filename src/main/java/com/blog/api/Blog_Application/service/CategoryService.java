package com.blog.api.Blog_Application.service;

import com.blog.api.Blog_Application.payloads.CategoryDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {
    //Create
    public CategoryDTO createCategory(CategoryDTO categoryDTO);
    //Update

    public CategoryDTO updateCategory(CategoryDTO categoryDTO,Integer categoryId);

    //Get
    public void deleteCategory(Integer categoryId);

    //Delete
    public CategoryDTO getCategory(Integer categoryId);

    //get all
    List<CategoryDTO> getAllCategories();


}
