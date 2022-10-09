package com.sprint.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter @Getter
public class BookDto {

    private Long id;

    //제목
    private String title;

    //단종여부
    private boolean discontinued;

    //isbn
    private String isbn;

    //총페이지수
    private int total_number;

    //발간년도
    private Date publication_date;

    //가격
    private int price;

    //통화
    private String cell;

    //책의 저자
    // private Author author;

}