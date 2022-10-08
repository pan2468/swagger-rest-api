package com.sprint.service;

import com.sprint.entity.Book;
import com.sprint.repository.BookRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@TestPropertySource(locations = "classpath:application.properties")
class BookServiceTest {

    @Autowired
    BookRepository bookRepository;

    @Test
    @DisplayName("Service 테스트 등록")
    public void createBookTest(){
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

    @Test
    @DisplayName("Service 테스트 조회")
    public void findBookTest(){
        this.createBookTest();
        List<Book> bookList = bookRepository.findAll();

        Book list = bookList.get(0);
        System.out.println(list.toString());
    }
}
