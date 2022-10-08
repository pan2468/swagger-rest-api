package com.sprint.service;

import com.sprint.entity.Book;
import com.sprint.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public void save(Book book) {
        bookRepository.save(book);
    }
}