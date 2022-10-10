package com.sprint.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "book")
@ToString
@Setter @Getter
public class Book {

    @Id
    @Column(name = "book_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //제목
    @Column(length = 255)
    private String title;

    //단종여부
    private String discontinued;

    //isbn
    private String isbn;

    //총페이지수
    private int total_number;

    //발간년도
    private LocalDateTime publication_date = LocalDateTime.now();

    //가격
    private int price;

    //통화
    private String cell;

    //책의 저자
    // private Author author;
}
