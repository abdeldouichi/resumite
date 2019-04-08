package com.resumite.resumite.data.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.extern.java.Log;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "USER")
@Getter
@Setter
@Log
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "USER_ID")
    private long id;
    @Id
    @Column(name = "LOGIN")
    private String login;
    @Column(name = "PASSWORD", nullable = false)
    private String password;
    @Column(name = "ROLE", nullable = false)
    private String role;
    @Column(name = "META")
    private String meta;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "IO_DATE")
    private IoDate ioDate;

    public User(){
        this.ioDate = new IoDate(new Date(),new Date(),"User");
        }

    public void markUpdate(){
        this.ioDate.setEditDate(new Date());
    }
}
