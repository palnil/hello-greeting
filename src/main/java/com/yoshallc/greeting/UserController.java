package com.yoshallc.greeting;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/allusers")
    public List<UserEntity> getAllUsers(){

        return userService.getAllUsers();

    }

    @GetMapping("/finduser/{name}")
    public UserEntity findUserByName(@PathVariable String name){

        return userService.findByName(name);

    }

    @GetMapping("/finduser/{name}/{sex}")
    public UserEntity findUserByNameAndSex(@PathVariable String name, @PathVariable String sex){

        return userService.findByNameAndSex(name,sex);

    }

    @PostMapping("/saveuser")
    public void saveUser(@RequestBody UserEntity user){

        userService.saveUser(user);

    }


}
