package com.yoshallc.greeting;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "user")
public class UserEntity {


    private String name;
    private String sex;

    public UserEntity(String name, String sex){

        this.name = name;
        this.sex = sex;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
}

