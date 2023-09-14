package com.example.demo.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity

public class AdminUser {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "post_generator")
    @TableGenerator(name = "post_generator", table = "id_generator", pkColumnName = "id_name", valueColumnName = "id_value", allocationSize = 1)
    @Column(name="id")
    private int id;

    @Column(name="userName")
    private String userName;

    @Column(name = "password")
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AdminUser(int id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    public AdminUser() {
    }


}
