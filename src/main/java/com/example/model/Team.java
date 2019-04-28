package com.example.model;

import com.example.model.User;
import java.util.List;

public class Team {
    private Integer id;
    private String name;
    private String location;
    private List<User> players;

    public Team() {
        super();
    }

    public Team(String name, String location, List<User> players) {
        super();
        this.name = name;
        this.location = location;
        this.players = players;
    }

    public List<User> getPlayers() {
        return this.players;
    }

    public void setPlayers(List<User> players) {
        this.players = players;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getLocation() {
        return this.location;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}