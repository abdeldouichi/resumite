package com.resumite.resumite.data.entity;

import com.resumite.resumite.data.entity.core.AbstractEntity;
import com.resumite.resumite.data.entity.user.User;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.java.Log;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "USER_DATA")
@Getter
@Setter
@Log
public class UserData extends AbstractEntity {


    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "USER_ID")
    private User user;

    @Column(name = "EMAIL", nullable = false)
    private String email;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "FAMILY_NAME")
    private String familyName;

    @Column(name = "TEL")
    private String tel;

    @Column(name = "ZIPCODE")
    private String zipcode;

    @Column(name = "CITY")
    private String city;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "ADDRESS_PRIMARY")
    private String addressePrimary;

    @Column(name = "ADDRESS_SECONDARY")
    private String addresseSecondary;

    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL)
    @JoinColumn(name="ACCOUNT_LINK_URL", referencedColumnName="USER_DATA_ID")
    private List<AccountLink> accounts;



    public void initDate() {
        this.ioDate = new IoDate(new Date(),new Date(),this.getClass().getName());
    }
    public void markUpdate(){
        this.ioDate.setEditDate(new Date());
    }
}
