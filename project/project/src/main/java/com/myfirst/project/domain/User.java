package com.myfirst.project.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

//Adding getter and setter with help of Lombok with help Data annotation
//Must contain ID or else it will generate error
@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private String dob;
    private String email;
    private String contact;
    private String cnic;
    private String address;


}
