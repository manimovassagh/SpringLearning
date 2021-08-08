package com.github.manimovassagh.springlearning.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

import static com.github.manimovassagh.springlearning.user.UserDaoService.users;

@RestController
public class UserResource {
    @Autowired
    UserDaoService service;

    //retrieve all Users   Get /users
    @GetMapping("/users")
    public List<User> findAllUsers() {
                return service.findAllUsers();

    }
    //Retrieve one User Get /users/{id}
    @GetMapping("users/{id}")
    public User findOneUser(@PathVariable("id") Integer id){
        return service.findOneUser(id);
    }

       //Add a User Post /users
    @PostMapping("/users")
    public void addUser(@RequestBody User user){
        service.addUser(user);
    }
}
