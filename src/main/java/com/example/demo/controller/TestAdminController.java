package com.example.demo.controller;

import com.example.demo.model.AdminUser;
import com.example.demo.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class TestAdminController {

    private final AdminUserService adminUserService;

    @Autowired
    public TestAdminController(AdminUserService adminUserService){
        this.adminUserService=adminUserService;
    }

    @PostMapping("/create")
    public String createAdminUser(@RequestBody AdminUser admin){
        return adminUserService.createAdmin(admin);
    }

    @GetMapping("/")
    public ResponseEntity<?> getAllAdmin(){
        return ResponseEntity.ok(adminUserService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable int id){
        Optional<AdminUser> adminOptional = adminUserService.getById(id);
        if (adminOptional.isPresent()) {
            AdminUser admin = adminOptional.get();
            return ResponseEntity.ok(admin);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/update/{id}")
    public String update(@PathVariable int id, @RequestBody AdminUser adminUser){
        return adminUserService.update(id, adminUser);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        return adminUserService.delete(id);
    }

}
