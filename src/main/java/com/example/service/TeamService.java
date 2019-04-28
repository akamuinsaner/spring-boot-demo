package com.example.service;
import com.example.model.Team;
import com.example.mapper.TeamMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TeamService {
    @Autowired
    private TeamMapper teamMapper;

    public List<Team> getTeams() { return teamMapper.getTeams(); };
}