package com.yoshallc.greeting;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.security.SecureRandom;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository  extends JpaRepository<UserEntity,Long> {

    public UserEntity findByName(String name);

    public UserEntity findByNameAndSex(String name, String sex);
}
