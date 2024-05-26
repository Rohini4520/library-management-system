package com.acciojob.librarymanagementsystem.Models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.boot.registry.selector.spi.StrategyCreator;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Student {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer StudentId;

    private String name;

    private Integer age;

    private String branch;
    @Column(unique = true,length = 300)
    private String EmailId;

    private String address;

}



