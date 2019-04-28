package com.example.controller;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.model.User;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public User getUser(@RequestParam(value="id") Integer id) {
        User user=userService.getUserById(id);
        return user;
    }

    @RequestMapping("/users")
    public User[] getUsers() {
        User[] users = userService.getUsers();
        return users;
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable("id") Integer id) {
        userService.deleteUser(id);
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public int insertUser(@RequestBody User user) {
        int id = userService.insertUser(user.getUsername(), user.getPassword(), user.getName());
        return id;
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.PATCH)
    public int updateUser(@PathVariable("id") Integer id, @RequestBody User user) {
        int updateId = userService.updateUser(user.getUsername(), user.getPassword(), user.getName(), id);
        return updateId;
    }

    @RequestMapping(value="/users", method = RequestMethod.DELETE)
    public void deleteAllUser() {
        userService.deleteAllUser();
    }
}
