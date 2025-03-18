package com.blog.api.Blog_Application.controller;

import com.blog.api.Blog_Application.payloads.ApiResponse;
import com.blog.api.Blog_Application.payloads.CategoryDTO;
import com.blog.api.Blog_Application.service.CategoryService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;
    //Create
    @PostMapping("/")
    public ResponseEntity<CategoryDTO> createCategory(@Valid @RequestBody CategoryDTO categoryDTO) {

        CategoryDTO createCategory = this.categoryService.createCategory(categoryDTO);
        return new ResponseEntity<CategoryDTO>(createCategory, HttpStatus.CREATED);
    }
    //Update
    @PutMapping("/{catId}")
    public ResponseEntity<CategoryDTO> UpdateCategory(@Valid @RequestBody CategoryDTO categoryDTO,@PathVariable Integer catId) {

        CategoryDTO UpdateCategory = this.categoryService.updateCategory(categoryDTO,catId);
        return new ResponseEntity<CategoryDTO>(UpdateCategory, HttpStatus.OK);
    }
    //Delete
    @DeleteMapping("/{catId}")
    public ResponseEntity<ApiResponse> DeleteCategory(@PathVariable Integer catId) {
        this.categoryService.deleteCategory(catId);
        return new ResponseEntity<ApiResponse>(new ApiResponse("Category deleted successfully", true), HttpStatus.OK);
    }
    //Get
    @GetMapping("/{catId}")
    public ResponseEntity<CategoryDTO> getSingleCategory(@PathVariable Integer catId) {

        CategoryDTO categoryDTO = this.categoryService.getCategory(catId);
        return new ResponseEntity<CategoryDTO>(categoryDTO, HttpStatus.OK);
    }
    //Get All
    @GetMapping("/")
    public ResponseEntity<List<CategoryDTO>> getAllCategories() {

        List<CategoryDTO> categories = this.categoryService.getAllCategories();
        return new ResponseEntity<List<CategoryDTO>>(categories, HttpStatus.OK);
    }
}
