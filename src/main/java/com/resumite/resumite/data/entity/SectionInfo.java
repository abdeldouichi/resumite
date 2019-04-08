package com.resumite.resumite.data.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.java.Log;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "SECTION_INFO")
@Getter
@Setter
@Log
public class SectionInfo {
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Id
    @Column(name = "SECTION_INFO_ID")
    private long id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "VALUE")
    private String value;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "DATE_INFO")
    private IoDate dateInfo;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "SECTION_INFO_PARENT")
    private SectionInfo parent;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "USER_ID")
    private User user;

    @Column(name = "TYPE")
    private String type;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "IO_DATE")
    private IoDate ioDate;

    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL)
    @JoinColumn(name="ACCOUNT_LINK_URL", referencedColumnName="SECTION_INFO_ID")
    private List<AccountLink> accountLinks;

    public SectionInfo() {
        this.ioDate = new IoDate(new Date(),new Date(),"Section "/*waiting for type*/);
    }
    public void markUpdate(){
        this.ioDate.setEditDate(new Date());
    }
}
