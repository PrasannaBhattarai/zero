package com.example.demo.service;

import com.example.demo.model.AdminUser;
import com.example.demo.repository.AdminUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminUserService {

    private final AdminUserRepository repository;

    @Autowired
    public AdminUserService(AdminUserRepository repository) {
        this.repository=repository;
    }

    public String createAdmin(AdminUser adminUser) {
        repository.save(adminUser);
        return "Admin User Created";
    }

    public List<AdminUser> getAll() {
        return repository.findAll();
    }

    public Optional<AdminUser> getById(int id){
        return repository.findById(id);
    }


    public String update(int id,AdminUser adminUser) {
        Optional<AdminUser> admin= repository.findById(id);
        if (admin.isPresent()){
            AdminUser updated = admin.get();
            updated.setUserName(adminUser.getUserName());
            updated.setPassword(adminUser.getPassword());
            repository.save(updated);
            return "User updated successfully!";
        }
        else{
        return "User not found!";
        }
    }

    public String delete(int id) {
        Optional<AdminUser> admin= repository.findById(id);
        if(admin.isPresent()){
            repository.deleteById(id);
            return "Deleted successfully!";
        }
        else{
            return "User not found!";
        }
    }
}
