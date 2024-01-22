package com.ssafy.lam.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User {
    @Id
    @GeneratedValue
    @Column(name="user_seq")
    private int userSeq;
    @Column(name="user_id")
    private String userId;
    @Column(name="user_password")
    private String userPassword;


}
