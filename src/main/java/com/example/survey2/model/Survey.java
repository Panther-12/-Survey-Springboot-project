package com.example.survey2.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "survey")
public class Survey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String first_name;

    @Column(nullable = false)
    private String last_name;

    @Column(nullable = false)
    private String street_address;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String state;

    @Column(nullable = false)
    private int zip;

    @Column(nullable = false)
    private int telephone_number;

    @Column(nullable = false)
    private String email;

    @Column(name = "Date of Survey", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;


    @Column(name = "What do you like most about campus ?",nullable = true)
    private String  campus;

    @Column(name = "How did you get interested in the campus ?",nullable = true)
    private String interest;

    @Column(name = "What is the likelihood of recommending to community ?",nullable = true)
    private String recommend;



    // Constructors, getters and setters, and other methods...
}
