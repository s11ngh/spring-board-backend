package com.Coffee.Coffee.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blog")
public class BlogController {

    @GetMapping("/add")
    public ResponseEntity<String> addBlog() {
        // Your implementation for adding a blog goes here
        return ResponseEntity.ok("Blog added successfully"); // You can customize the response as needed
    }

    // You can add more controller methods for handling different endpoints related to blogs
}
