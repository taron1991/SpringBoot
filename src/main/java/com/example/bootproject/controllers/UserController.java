package com.example.bootproject.controllers;

import com.example.bootproject.model.User;
import com.example.bootproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*ENV SPRING_DATASOURCE_URL=jdbc:postgresql://postgresql:5432/postgres
ENV SPRING_DATASOURCE_USERNAME=postgres
ENV SPRING_DATASOURCE_PASSWORD=westside*/

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/AllUsers")
    public List<User> findAll(){
        List<User> users = userService.findAll();
        return users;
    }


    @PostMapping("/user-create")
    public User createUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @DeleteMapping("/user-delete/{id}")
    public String deleteUser(@PathVariable("id") Long id){
        userService.deleteById(id);
        return "redirect:/users";
    }


    @PutMapping("/user-update")
    public User updateUser(@RequestBody User user){
        return userService.saveUser(user);
    }
}
