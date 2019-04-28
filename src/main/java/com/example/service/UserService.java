package com.example.service;
import com.example.model.User;
import com.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public User getUserById(int id) {
        return userMapper.getUserById(id);
    }
    public User[] getUsers() { return userMapper.getUsers(); }
    public void deleteUser(int id) { userMapper.deleteUser(id); }
    public int insertUser(String username, String password, String name) {
        return userMapper.insertUser(username, password, name);
    }
    public int updateUser(String username, String password, String name, int id) {
        return userMapper.updateUser(username, password, name, id);
    }
    public void deleteAllUser() {
        userMapper.deleteAllUser();
    }
}
