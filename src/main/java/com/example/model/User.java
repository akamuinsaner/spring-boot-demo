package com.example.model;
import java.util.List;

public class User {
    private Integer id;
    private String username;
    private String password;
    private String name;
    private Integer teamId;
    private Team team;

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
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTeamId() {
        return this.teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public Team getTeam() {
        return this.team;
    }

    public void setTeam(Team team) {
        this.team = team;
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