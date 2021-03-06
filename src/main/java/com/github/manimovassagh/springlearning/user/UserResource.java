package com.github.manimovassagh.springlearning.user;


import java.net.URI;
import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;



@RestController
public class UserResource {
    @Autowired
    UserDaoService service;

    //retrieve all Users   Get /users
    @GetMapping("/users")
    public List<User> findAllUsers() {
        return service.findAllUsers();

    }


    @GetMapping("/")
    public String justCheckHome(){
        return "Hi Mani Welcome to Your Website " ;
    }


    //Retrieve one User Get /users/{id}
    @GetMapping("users/{id}")
    public User findOneUser(@PathVariable("id") Integer id) {
        return service.findOneUser(id);
    }

    @PostMapping("/users/{name}")
    public String getSomeName(@RequestBody String name) {
        return name;
        
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

    @DeleteMapping ("users/{id}")
    public void deleteUser(@PathVariable("id") Integer id) throws UserPrincipalNotFoundException {

        User deletedUser = service.deleteUser(id);
        if(deletedUser==null){
            throw new UserPrincipalNotFoundException("User Not Found Please Try with Valid User");
        }
    }

}
