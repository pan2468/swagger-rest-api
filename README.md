## 📌 Author-Book

###  1. 프로젝트 목적 
+ Author(저자), Book(도서) 연관관계 매핑하기
+ RestApi CRUD 구현하기 
+ TDD(테스트 주도 개발) 코드 구현하기 

### 2. 요구사항 Notion
 https://aeolian-caravan-34d.notion.site/c187b31dd4ed4934b7fbf085cbfc1d75

###  3. 제작기간 / 참여인원
+ 제작기간: 2022-10-04 ~ 진행
+ 참여인원: 개인 프로젝트

### 4. 사용 기술(기술스택)
#### Back-End
+ Java 8
+ SpringBoot 2.6.12
+ Gradle
+ H2 Database
+ TDD

### 5. IDE 개발환경
+ InteliJ IDEA

### 6. MSA 아키텍처

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


### 9. 기술적 issue 해결 과정
+ 프로젝트 생성<br> 
https://pan2468.tistory.com/124?category=1129064

+ Hello 테스트 실행<br>
https://pan2468.tistory.com/125

  






