package com.example.mapper;
import com.example.model.Team;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TeamMapper {
    public List<Team> getTeams();
}