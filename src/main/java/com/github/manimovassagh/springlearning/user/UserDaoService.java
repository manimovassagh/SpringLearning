package com.github.manimovassagh.springlearning.user;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

@Component
public class UserDaoService {

    public static int userCount = 5;
    public static List<User> users = new ArrayList<>();
    static {
        users.add(new User(1, "Sahar", new Date()));
        users.add(new User(2, "Mani", new Date()));
        users.add(new User(3, "Mehdi", new Date()));
        users.add(new User(4, "David", new Date()));
        users.add(new User(5, "Armin", new Date()));
    }

//Find All Users
    public List<User> findAllUsers(){
        return users;
    }
//Find Specific User
    public User findOneUser(Integer id){
       for (User user:users){
        if (user.getId()==id){
            return user;
        }
       }
        return null;
    }

    //Save New User
    public User addUser(User user){
        if (user.getId()==0){
            user.setId(++userCount);
        }
               users.add(user);
        return user;
    }

    //Delete a User from List
    public void deleteUser(Integer id){
        Stream<User> userStream = users.stream().filter(user -> user.getId() != id);
    }

}
