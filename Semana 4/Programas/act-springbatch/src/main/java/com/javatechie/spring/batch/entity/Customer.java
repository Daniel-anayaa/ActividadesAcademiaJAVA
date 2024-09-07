package com.javatechie.spring.batch.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMERS_INFO")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    @Column(name = "CUSTOMER_ID")
    private int id;
    @Column(name = "FIRST_NAME")
    private String first;
    @Column(name = "LAST_NAME")
    private String last;
    @Column(name = "EMAIL")
    private String mail;
    @Column(name = "GENDER")
    private String gender;
    @Column(name = "CONTACT")
    private String contactInfo;
    @Column(name = "BORN")
    private String born;
    @Column(name = "STATE")
    private String state;


}
