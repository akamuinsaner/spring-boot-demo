package com.example.mapper;
import com.example.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {
    public User getUserById(int id);
    public User[] getUsers();
    public void deleteUser(int id);
    public Integer insertUser(String username, String password, String name);
    public Integer updateUser(String username, String password, String name, int id);
    public void deleteAllUser();
}