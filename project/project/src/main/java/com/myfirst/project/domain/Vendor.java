package com.myfirst.project.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@Entity
public class Vendor

{

@Id
private String vendorId;
private String vendorName;
private String vendorContact;
private String vendorEmail;

}
