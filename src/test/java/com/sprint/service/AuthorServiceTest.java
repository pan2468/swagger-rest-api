package com.sprint.service;

import com.sprint.entity.Author;
import com.sprint.repository.AuthorRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.security.crypto.password.PasswordEncoder;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@TestPropertySource(locations = "classpath:application.properties")
class AuthorServiceTest {

    @Autowired
    AuthorRepository authorRepository;

    @Test
    @DisplayName("회원 가입 테스트")
    public void author_sign_up() {
        Author author = new Author();
        author.setName("홍길동");
        author.setBirthdate("1999-11-19");
        authorRepository.save(author);
    };


}
