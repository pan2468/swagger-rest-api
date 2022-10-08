package com.sprint.controller;

import com.sprint.entity.Book;
import com.sprint.service.BookService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@AutoConfigureMockMvc
@TestPropertySource(locations = "classpath:application.properties")
class BookControllerTest {

    @Autowired
    BookService bookService;

    @Test
    @DisplayName("Controller 테스트 등록")
    public void createBookTest(){
        Book book = new Book();
        book.setTitle("제목");
        book.setDiscontinued("Y");
        book.setIsbn("참");
        book.setTotal_number(100);
        book.setPublication_date(LocalDateTime.now());
        book.setPrice(1500);
        book.setCell("010-1111-2222");
        bookService.save(book);
    }
}