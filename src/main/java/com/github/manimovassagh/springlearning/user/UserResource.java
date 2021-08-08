package com.github.manimovassagh.springlearning.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

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
    public User findOneUser(@PathVariable("id") Integer id) {
        return service.findOneUser(id);
    }

    //Add a User Post /users
    @PostMapping("/users")
    public ResponseEntity<Object> addUser(@RequestBody User user) {
        User savedUser = service.addUser(user);
      URI location= ServletUriComponentsBuilder.
              fromCurrentRequest().
              path("/{id}").
              buildAndExpand(savedUser.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping
    public Integer deleteFromList(@PathVariable Integer id) {
        service.deleteUser(id);
        return id;

    }
}
