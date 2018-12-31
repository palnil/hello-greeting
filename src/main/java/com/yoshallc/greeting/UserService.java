package com.yoshallc.greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {


    private UserRepository userRepository;

    public UserService(UserRepository userRepository){

        this.userRepository = userRepository;
    }


    public List<UserEntity> getAllUsers(){
        
       return userRepository.findAll();

    }

    public void saveUser(UserEntity userEntity){

        userRepository.save(userEntity);
    }

    public UserEntity findByName(String name){

       return  userRepository.findByName(name);
    }

    public UserEntity findByNameAndSex(String name, String sex){

        return  userRepository.findByNameAndSex(name,sex);
    }
}
