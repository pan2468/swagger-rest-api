package com.sprint.service;

import com.sprint.entity.Book;
import com.sprint.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public Book bookSave(Book book) {
        Book bookSave = bookRepository.save(book);

        return bookSave;
    }

    public List<Book> findAll() {
        List<Book> list = bookRepository.findAll();

        return list;
    }
}