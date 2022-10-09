package com.sprint.controller;

import com.sprint.entity.Book;
import com.sprint.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired BookService bookService;

    // 등록
    @PostMapping("/add")
    public Book BookAdd(@ModelAttribute Book book){

        return bookService.bookSave(book);
    }

    // 목록 조회
    @GetMapping("/list")
    public List<Book> BookList(@ModelAttribute Book book){

        List<Book> list = bookService.findAll();

        return list;
    }

    // 상세 조회
    @GetMapping("/detail/{id}")
    public Optional<Book> BookDetail(@PathVariable("id") Long id){

        Optional<Book> detail = bookService.findById(id);

        return detail;
    }

    // 수정
    @PutMapping("/update")
    public Optional<Book> BookUpdate(@ModelAttribute Book book){

        Optional<Book> update = bookService.update(book);

        return update;
    }

    @DeleteMapping("/delete/{id}")
    public Optional<Book> BookDelete(@PathVariable("id")Long id){

        Optional<Book> delete = bookService.delete(id);

        return delete;
    }

}
