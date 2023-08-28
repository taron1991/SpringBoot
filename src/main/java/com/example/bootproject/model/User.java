package com.example.bootproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "users1")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
}