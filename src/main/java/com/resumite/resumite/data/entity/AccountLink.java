package com.resumite.resumite.data.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.extern.java.Log;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ACCOUNT_LINK")
@Getter
@Setter
@Log
public class AccountLink {

    @GeneratedValue(strategy= GenerationType.AUTO)
    @Id
    @Column(name = "ACCOUNT_LINK_ID")
    private long id;

    @Column(name = "ACCOUNT_LINK_NAME")
    private String name;

    @Column(name = "ACCOUNT_LINK_URL")
    private String url;

    @Column(name = "ACCOUNT_LINK_TYPE")
    private String type;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "IO_DATE")
    private IoDate ioDate;

    public void markUpdate(){
        this.ioDate.setEditDate(new Date());
    }

}
