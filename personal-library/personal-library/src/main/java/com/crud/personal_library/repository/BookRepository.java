package com.crud.personal_library.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.personal_library.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    
}

