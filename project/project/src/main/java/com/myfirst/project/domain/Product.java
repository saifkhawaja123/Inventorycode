package com.myfirst.project.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "product")
public class Product
{
    @Id
    private Long productId;
    private String productCategory;
    private String productName;
    private String productDescription;
    private Long productPrice;
    private Long retailPrice;

}
