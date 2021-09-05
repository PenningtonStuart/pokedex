package com.practice.pokedex.entity.userInfo;

import javax.persistence.*;

@Entity
@Table(name = "userInfo")
public class userInforamtion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String email;
    private String password;

    //TODO add getters and setters
}
