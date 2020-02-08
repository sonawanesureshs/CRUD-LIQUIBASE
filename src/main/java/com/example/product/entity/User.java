package com.example.product.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String firstname;
    String lastname;
    String emailid;
    String username;
    String addr1;
    String addr2;
    String state;
    String zip;
    String contact;
    String altcontact;
    String city;
    String country;
}
