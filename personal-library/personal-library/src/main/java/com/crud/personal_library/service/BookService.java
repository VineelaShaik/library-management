package com.crud.personal_library.service;


import java.util.List;
import java.util.Optional;

import com.crud.personal_library.model.Book;

public interface BookService {
    Book saveBook(Book book);
    List<Book> getAllBooks();
    Optional<Book> getBookById(Long id);
    Book updateBook(Long id, Book book);
    void deleteBook(Long id);
}

