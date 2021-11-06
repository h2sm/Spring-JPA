package com.h2sm.springjpahibernate.entities;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="client")
@Data
public class Client {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "passport")
    private String passport;
    @Column(name = "tel_name")
    private String phoneNumber;
    @Column(name = "date_of_birth")
    private Date date_of_birth;
}
