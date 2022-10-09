package com.sprint.service;

import com.sprint.entity.Book;
import com.sprint.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

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

    public Optional<Book> findById(Long id) {
        Optional<Book> detail = bookRepository.findById(id);

        return detail;
    }

    public Optional<Book> update(Book book) {
        Book update = bookRepository.save(book);

        return Optional.of(update);
    }

    public Optional<Book> delete(Long id) {

        Optional<Book> book = bookRepository.deleteAllById(id);

        return book;
    }
}