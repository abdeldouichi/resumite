package com.resumite.resumite.data.entity;


import com.resumite.resumite.data.entity.core.AbstractEntity;
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
public class AccountLink extends AbstractEntity {



    @Column(name = "ACCOUNT_LINK_NAME")
    private String name;

    @Column(name = "ACCOUNT_LINK_URL")
    private String url;

    @Column(name = "ACCOUNT_LINK_TYPE")
    private String type;


    public void initDate() {
        this.ioDate = new IoDate(new Date(),new Date(),this.getClass().getName());
    }

    public void markUpdate(){
        this.ioDate.setEditDate(new Date());
    }

}
