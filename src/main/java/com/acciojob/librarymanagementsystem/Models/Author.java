package com.acciojob.librarymanagementsystem.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

//@Entity
//@Table
@Entity
@Table(name = "author_info")
@Setter
@Getter
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer authorId;

    private String authorName;

    private Integer age;

    private Integer noOfBooks;

    private Double ratings;

    private String emailId;





}
