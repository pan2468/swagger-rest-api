package com.sprint.controller;

import com.sprint.entity.Book;
import com.sprint.service.BookService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Log4j2
@RequestMapping("/book")
public class BookController {

    @Autowired BookService bookService;

    @PostMapping("/add")
    public Book BookAdd(@ModelAttribute Book book){

        return bookService.bookSave(book);
    }
}
