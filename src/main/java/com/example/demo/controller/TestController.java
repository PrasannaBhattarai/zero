package com.example.demo.controller;

import com.example.demo.model.AdminUser;
import com.example.demo.model.Post;
import com.example.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/post")
public class TestController {


    @Autowired
    PostService service;


    @GetMapping("/")
    public List<Post> getAll() {
        List<Post> postList = service.getAll();
        return postList;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable int id) {
        ResponseEntity<?> postList= service.getData(id);
        return postList;
    }


    @PostMapping("/create")
    public String createNew(@RequestBody Post post) {
        service.createPost(post);
        return "done creation";
    }

    @PutMapping("/update/{id}")
    public String updateValue(@PathVariable int id,@RequestBody Post post) {
        String value=service.updatePost(id,post);
        return value;
    }

    @DeleteMapping("delete/{id}")
    public String deletion(@PathVariable int id) {
        String value= service.deletePost(id);
        return value;
    }

    @GetMapping("/{id}/{image}")
    public List<?> findByIdAndImage(@PathVariable int id,@PathVariable String image){
        return service.findByIdAndImage(id, image);
    }


    /*Real Implementations*/

    @PostMapping("/adminuser")
    public ResponseEntity<String> createAdminUser(@RequestBody AdminUser request) {
        AdminUser adminUser = service.createAdminUser(request.getUserName(), request.getPassword());
        return ResponseEntity.status(HttpStatus.CREATED).body("AdminUser created with ID: " + adminUser.getId());
    }

}
