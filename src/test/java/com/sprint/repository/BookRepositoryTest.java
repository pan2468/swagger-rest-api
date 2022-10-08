package com.sprint.repository;

import com.sprint.entity.Book;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestPropertySource(locations = "classpath:application.properties")
class BookRepositoryTest {

    @Autowired BookRepository bookRepository;

    @Test
    @DisplayName("Repository 테스트 등록")
    public void createBookTest() {
        Book book = new Book();
        book.setTitle("제목");
        book.setDiscontinued("Y");
        book.setIsbn("참");
        book.setTotal_number(100);
        book.setPublication_date(LocalDateTime.now());
        book.setPrice(1500);
        book.setCell("010-1111-2222");
        bookRepository.save(book);
    }
}