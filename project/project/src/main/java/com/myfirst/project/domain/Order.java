package com.myfirst.project.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Inventory_order")
public class Order {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String orderDetail;
    private String orderDate;
    private Long orderPrice;


}
