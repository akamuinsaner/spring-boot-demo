package com.example.model;

public class User {
    private Integer id;
    private String username;
    private String password;
    private String name;

    public User() {
        super();
    }

    public User(String username, String password, String name) {
        super();
        this.password = password;
        this.username = username;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName(){ return name; }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }
}