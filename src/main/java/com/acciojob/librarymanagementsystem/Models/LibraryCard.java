package com.acciojob.librarymanagementsystem.Models;

import com.acciojob.librarymanagementsystem.Enum.CardStatus;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class LibraryCard {
@Id

    private Integer cardId;

    private Integer noOfBooksIssued;


    @Enumerated(value = EnumType.STRING)
    private CardStatus cardStatus;

    //this has to be written in child class

    @JoinColumn(referencedColumnName =  "emailId")//by default it adds the pk in case you add other column
    @OneToOne  //mapping between entries

    private Student student; //which entity you have connected



















}
