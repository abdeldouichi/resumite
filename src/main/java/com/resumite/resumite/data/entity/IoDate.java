package com.resumite.resumite.data.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.java.Log;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "IO_DATE")
@Getter
@Setter
@Log
public class IoDate {

    @GeneratedValue(strategy= GenerationType.AUTO)
    @Id
    @Column(name = "SECTION_INFO_ID")
    private long id;
    @Column(name = "DATA_NAME")
    private String dataName;
    @Column(name = "CREATED_AT")
    private Date inDate;
    @Column(name = "PUBLISHED_AT")
    private Date outDate;
    @Column(name = "UPDATED_AT")
    private Date editDate;

    public IoDate(Date inDate, Date editDate, String dataName) {
        this.inDate = inDate;
        this.editDate = editDate;
        this.dataName = dataName;
    }

}
