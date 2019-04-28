package com.example.controller;
import com.example.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.model.Team;

import java.util.List;

@RestController
public class TeamController {
    @Autowired
    private TeamService teamService;

    @RequestMapping("/teams")
    public List<Team> getTeams() {
        return teamService.getTeams();
    }
}