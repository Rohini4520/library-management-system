package com.acciojob.librarymanagementsystem.Repositories;

import com.acciojob.librarymanagementsystem.Models.LibraryCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<LibraryCard, Integer> {
}
