package com.acciojob.librarymanagementsystem.Services;

import com.acciojob.librarymanagementsystem.Enum.CardStatus;
import com.acciojob.librarymanagementsystem.Models.LibraryCard;
import com.acciojob.librarymanagementsystem.Models.Student;
import com.acciojob.librarymanagementsystem.Repositories.CardRepository;
import com.acciojob.librarymanagementsystem.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CardService {
@Autowired

private CardRepository cardRepository;
@Autowired
private StudentRepository studentRepository;

    public String addNewCard(){

        LibraryCard card = new LibraryCard();
        card.setCardStatus(CardStatus.NEW);
        card.setNoOfBooksIssued(0);

        card= cardRepository.save(card);

        return "Card has been generated with the cardID "+ card.getCardId();
    }

    public String associateCardAndStudent(Integer cardId, Integer studentId){

        LibraryCard card = cardRepository.findById(cardId).get();


        Student student = studentRepository.findById(studentId).get();


        card.setStudent(student);

        card.setCardStatus(CardStatus.ACTIVE);

        cardRepository.save(card);
        return "Associating card and student with cardId"+cardId  +" ans StudentId  "+studentId;


    }

}
