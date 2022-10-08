package com.sprint.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "author")
@ToString
@Setter @Getter
public class Author {

    @Id
    @Column(name = "author_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //이름
    @Column(length = 255)
    private String name;

    //생년월일
    private String birthdate;

}
