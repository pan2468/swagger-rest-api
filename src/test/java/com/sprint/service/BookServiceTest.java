package com.sprint.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sprint.dto.BookDto;
import com.sprint.entity.Book;
import com.sprint.repository.BookRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.time.LocalDateTime;
import java.util.List;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@Transactional
@TestPropertySource(locations = "classpath:application.properties")
class BookServiceTest {

    @Autowired
    BookRepository bookRepository;

    @Test
    @DisplayName("테스트 등록")
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
    @DisplayName("테스트 조회")
    public void findBookTest(){
        this.createBookTest();
        List<Book> bookList = bookRepository.findAll();

        Book list = bookList.get(0);
        System.out.println(list.toString());
    }

    @Test
    @DisplayName("테스트 상세 조회")
    public void findByIdBookTest(){
        this.createBookTest();
        List<Book> bookList = bookRepository.findAll();

        Book book = bookList.get(0);
        Book list = bookRepository.findById(book.getId())
                .orElseThrow(EntityNotFoundException::new);

        assertEquals(list.getId(), book.getId());
    }

    @Test
    @DisplayName("테스트 수정")
    public void updateBookTest(){
        String title = "제목1";
        String discontinued = "N";

        this.createBookTest();
        List<Book> bookList = bookRepository.findAll();

        Book book = bookList.get(0);
        book.setTitle("제목1");
        book.setDiscontinued("N");

        bookRepository.save(book);

        assertThat(book.getTitle()).isEqualTo(title);
        assertThat(book.getDiscontinued()).isEqualTo(discontinued);
    }

    @Test
    @DisplayName("테스트 삭제")
    public void deleteBookTest(){
        Long num = 1L;
        this.createBookTest();
        bookRepository.deleteById(num);

        List<Book> accountBooks = bookRepository.findAll();

        System.out.println(accountBooks.toString());

    }

}
