package com.example.dialy.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "g_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "role_id")
    private Long roleId;

}
