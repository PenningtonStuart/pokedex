package com.practice.pokedex.entity.userInfo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Date;


@Entity
@Table(name = "userInfo")
public class userInforamtion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String email;
    private String password;
    @JsonFormat(pattern = "yyyy-mm-dd", timezone = "CST")
    private Date dateJoined;

    //TODO add getters and setters
}
