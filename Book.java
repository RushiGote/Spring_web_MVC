package com.example.mvc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
    @Id
    private Integer id;
    private String title;
    private String author;

    // Getters and Setters
}
