## 📌 Author-Book

###  1. 프로젝트 목적 
+ Author(저자), Book(도서) 연관관계 매핑하기
+ RestApi CRUD 구현하기 
+ TDD(테스트 주도 개발) 코드 구현하기 


###  3. 제작기간 / 참여인원
+ 제작기간: 2022-10-04 ~ 2022-10-11 
+ 참여인원: 개인 프로젝트

### 4. 사용 기술(기술스택)
#### Back-End
+ Java 8
+ SpringBoot 2.6.12
+ Gradle
+ H2 Database
+ MySQL
+ TDD

### 5. IDE 개발환경
+ InteliJ IDEA

### 6. MSA 아키텍처
> 안녕하세요

<img src="https://user-images.githubusercontent.com/58936137/194818072-e48d7b13-7cde-4bc6-b2e2-9e7411eace86.png" width="600px" height="400px">

###  7. 핵심트러블슈팅 경험

###  8. 트러블슈팅 경험
<details>
<summary>테스트 실행 오류</summary>
<div markdown="1">

- Execution failed for task ':test'. 
- 원인: InteliJ IDEA Run test using: Gradle -> InteliJ IDEA 변경 후 개선 

<img src="https://user-images.githubusercontent.com/58936137/193999166-8faac97d-ec01-444f-aa82-1bd76e5a4395.png" width="550px" height="400px">
 
</div>
</details> 

<details>
<summary>hello 메소드 테스트 오류</summary>
<div markdown="1">

- java.lang.AssertionError: Status Expected :200 Actual :404
- 원인: hello 메소드 get 주소와 같지 않아 발생

#### 기존 코드
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

#### 개선 코드
##### HelloControllerTest.class 
~~~
   @Test
    public void Hello()throws Exception{
        String hello = "hello";

        mvc.perform(get("/hello")) // 변경
                .andExpect(status().isOk())
                .andExpect(content().string(hello));
    }
~~~



</div>
</details> 

<details>
<summary>Repository 테스트 등록 실행오류</summary>
<div markdown="1">
 
 - java.lang.NullPointerException
	at com.sprint.repository.BookRepositoryTest.createBookTest(BookRepositoryTest.java:39)
 - Find Why bookRepository could be null <br>
 - 해결 원인: 정확한 원인을 찾지 못했지만 InteliJ IDEA > Invalidate Caches > Invalidate and Restart 클릭하여 재시작 후 해결
 #### 해결 방법
	
 <img src="https://user-images.githubusercontent.com/58936137/194700981-957bee0e-69d3-42d1-b8bb-b9221a018967.png" width="300px" height="200px">
	
 + Invalidate and Restart 클릭하여 InteliJ IDEA 재시작하기
	
</div>
</details> 

<details>
<summary>Repository 테스트 삭제 실행오류</summary>
<div markdown="1">

- org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'com.sprint.service.BookServiceTest': 

</div>
</details> 

<details>
<summary>Swagger Run 실행 오류</summary>
<div markdown="1">

- org.springframework.context.ApplicationContextException: Failed to start bean 'documentationPluginsBootstrapper'; nested exception is java.lang.NullPointerException
- 해결원인: SpringBoot 2.6 버전 이상 일경우 spring.mvc.pathmatch.matching-strategy 값이 ant_apth_matcher에서 path_pattern_parser로 변경되면서 오류발생함 

#### application.properties
<img src="https://user-images.githubusercontent.com/58936137/194755394-98e79aad-ec05-4de5-b1be-ccfec9e5cdb7.png" width="400px" height="50px">
<br>
💡 SpringBoot 2.6 버전 이상이라서 application.properties 파일에 spring.mvc.pathmatch.matching-strategy=ant_path_matcher 설정하여 개선함.    	

</div>
</details> 

### 9. 기술적 issue 해결 과정
+ 프로젝트 생성<br> 
https://pan2468.tistory.com/124?category=1129064

+ Hello 테스트 실행<br>
https://pan2468.tistory.com/125

+ Entity 생성하기 <br>
https://pan2468.tistory.com/126  

+ Book 테스트 코드 작성 <br>
https://pan2468.tistory.com/127

+ SpringBoot와 Swagger UI 연동하기<br>
https://pan2468.tistory.com/128

+ Book REST API CRUD 코드 작성




