package com.myfirst.project.domain;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "customer")
public class Customer {

    @Id
    private String customerId;
    private String customerName;
    private String customerContact;


}
