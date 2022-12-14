## π Author-Book

###  1. νλ‘μ νΈ λͺ©μ  
+ Author(μ μ), Book(λμ) μ°κ΄κ΄κ³ λ§€ννκΈ°
+ SpringBootμ Swagger UI μ°λνμ¬ REST API κ°λ° μ§ννκΈ°
+ TDD(νμ€νΈ μ£Όλ κ°λ°) μ½λ κ΅¬ννκΈ° 


###  3. μ μκΈ°κ° / μ°Έμ¬μΈμ
+ μ μκΈ°κ°: 2022-10-04 ~ 2022-10-11 
+ μ°Έμ¬μΈμ: κ°μΈ νλ‘μ νΈ

### 4. μ¬μ© κΈ°μ (κΈ°μ μ€ν)
#### Back-End
+ Java 8
+ SpringBoot 2.6.12
+ Gradle
+ H2 Database
+ MySQL
+ TDD

### 5. IDE κ°λ°νκ²½
+ InteliJ IDEA

### 6. MSA μν€νμ²
> MSA(Micro Service Architecture)μ΄λ νλμ μ νλ¦¬μΌμ΄μμ λ΄μμ Έ μλ μλ²λ₯Ό μμ μ»΄ν¬λνΈ λ³λ‘ μͺΌκ°μ΄ κ΄λ¦¬νλ μν€νμ²μλλ€. λ§μ μ¬μ©μλ€μ΄ νλμ μλ²μ λμ©λ νΈλν½ λ°μμΌλ‘ μ₯μ κ° μκΈ°κΈ° λλ¬Έμ μ΄λ₯Ό λμ²νκΈ° μν΄μ λ‘λλ°Έλ°μ±μΌλ‘ μλ²λ₯Ό λΆμ°νμ¬ κ΄λ¦¬ν©λλ€. 

<img src="https://user-images.githubusercontent.com/58936137/194907324-23a280a4-cb7c-4077-885e-fd352e955a14.png" width="600px" height="350px">

###  7. ν΅μ¬νΈλ¬λΈμν κ²½ν

###  8. νΈλ¬λΈμν κ²½ν
<details>
<summary>νμ€νΈ μ€ν μ€λ₯</summary>
<div markdown="1">

- Execution failed for task ':test'. 
- ν΄κ²° μμΈ: InteliJ IDEA Run test using: Gradle -> InteliJ IDEA λ³κ²½ ν κ°μ  

<img src="https://user-images.githubusercontent.com/58936137/193999166-8faac97d-ec01-444f-aa82-1bd76e5a4395.png" width="550px" height="400px">
 
</div>
</details> 

<details>
<summary>hello λ©μλ νμ€νΈ μ€λ₯</summary>
<div markdown="1">

- java.lang.AssertionError: Status Expected :200 Actual :404
- ν΄κ²° μμΈ: hello λ©μλ get μ£Όμμ κ°μ§ μμ λ°μ

#### κΈ°μ‘΄ μ½λ
##### HelloControllerTest.class
~~~
   @Test
    public void Hello()throws Exception{
        String hello = "hello";

        mvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(content().string(hello));
    }
~~~

#### κ°μ  μ½λ
##### HelloControllerTest.class 
~~~
   @Test
    public void Hello()throws Exception{
        String hello = "hello";

        mvc.perform(get("/hello")) // λ³κ²½
                .andExpect(status().isOk())
                .andExpect(content().string(hello));
    }
~~~



</div>
</details> 

<details>
<summary>Repository νμ€νΈ λ±λ‘ μ€νμ€λ₯</summary>
<div markdown="1">
 
 - java.lang.NullPointerException
	at com.sprint.repository.BookRepositoryTest.createBookTest(BookRepositoryTest.java:39)
 - Find Why bookRepository could be null <br>
 - ν΄κ²° μμΈ: μ νν μμΈμ μ°Ύμ§ λͺ»νμ§λ§ InteliJ IDEA > Invalidate Caches > Invalidate and Restart ν΄λ¦­νμ¬ μ¬μμ ν ν΄κ²°
 #### ν΄κ²° λ°©λ²
	
 <img src="https://user-images.githubusercontent.com/58936137/194700981-957bee0e-69d3-42d1-b8bb-b9221a018967.png" width="300px" height="200px">
	
 + Invalidate and Restart ν΄λ¦­νμ¬ InteliJ IDEA μ¬μμνκΈ°
	
</div>
</details> 

<details>
<summary>Repository νμ€νΈ μ­μ  μ€νμ€λ₯</summary>
<div markdown="1">

- org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'com.sprint.service.BookServiceTest': 

</div>
</details> 

<details>
<summary>Swagger Run μ€ν μ€λ₯</summary>
<div markdown="1">

- org.springframework.context.ApplicationContextException: Failed to start bean 'documentationPluginsBootstrapper'; nested exception is java.lang.NullPointerException
- ν΄κ²°μμΈ: SpringBoot 2.6 λ²μ  μ΄μ μΌκ²½μ° spring.mvc.pathmatch.matching-strategy κ°μ΄ ant_apth_matcherμμ path_pattern_parserλ‘ λ³κ²½λλ©΄μ μ€λ₯λ°μν¨ 

#### application.properties
<img src="https://user-images.githubusercontent.com/58936137/194755394-98e79aad-ec05-4de5-b1be-ccfec9e5cdb7.png" width="400px" height="50px">
<br>
π‘ SpringBoot 2.6 λ²μ  μ΄μμ΄λΌμ application.properties νμΌμ spring.mvc.pathmatch.matching-strategy=ant_path_matcher μ€μ νμ¬ κ°μ ν¨.    	

</div>
</details> 

<details>
<summary>LocalDataTime null μ€λ₯</summary>
<div markdown="1">

- 2022-10-10 19:47:24.353  WARN 9836 --- [io-8080-exec-10] .w.s.m.s.DefaultHandlerExceptionResolver : Resolved [org.springframework.validation.BindException: org.springframework.validation.BeanPropertyBindingResult: 1 errors<EOL>Field error in object 'book' on field 'publication_date': rejected value [2022-10-10]; codes [typeMismatch.book.publication_date,typeMismatch.publication_date,typeMismatch.java.time.LocalDateTime,typeMismatch]; 

- ν΄κ²° μμΈ: Book Entity λͺ¨λΈ μ λ³΄μμ private LocalDateTime publication_date = LocalDateTime.now(); λ³μ μμ νμ¬ μ€λ₯ κ°μ 

#### κΈ°μ‘΄ μ½λ 
<img src="https://user-images.githubusercontent.com/58936137/194856607-0a47c2b4-1436-4f50-86b8-74f1723435f0.png" width="500px" height="80px"><br>
+ POST λ°©μμΌλ‘ μμ²­νλ©΄ LocalDateTime null κ°μ΄ λμ΄ 	

#### κ°μ  μ½λ 
<img src="https://user-images.githubusercontent.com/58936137/194856207-73ac2559-7414-4b16-a009-dde2c73fc18d.png" width="500px" height="80px"><br>
+ LocalDateTime.now() μ½λ μΆκ° ν κ°μ 
	
</div>
</details> 

### 9. κΈ°μ μ  issue ν΄κ²° κ³Όμ 
+ νλ‘μ νΈ μμ±<br> 
https://pan2468.tistory.com/124?category=1129064

+ Hello νμ€νΈ μ€ν<br>
https://pan2468.tistory.com/125

+ Entity μμ±νκΈ° <br>
https://pan2468.tistory.com/126  

+ Book νμ€νΈ μ½λ μμ± <br>
https://pan2468.tistory.com/127

+ SpringBootμ Swagger UI μ°λνκΈ°<br>
https://pan2468.tistory.com/128

+ Book REST API CRUD μ½λ μμ± <br>
https://pan2468.tistory.com/129	




