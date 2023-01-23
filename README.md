# :bar_chart: 포토그램 (클론코딩)

인스타그램 클론 코딩

jpa와 스프링 부트를 통해 직접 웹 사이트를 만들어 보고 싶어 인스타그램 클론코딩을 진행하게 되었습니다.  
평소에 학습하고 싶었던 스프링 시큐리티와 OAuth2를 통해 로그인 기능을 구현 할 수 있었습니다.  
핸들러와 AOP를 통해 예외처리를 한 곳에서 처리할 수 있도록 구현하였습니다.  

# 제작기간
2022년 12월 5일 ~ 2022년 12월 12일

# 사용기술
- Java 11
- Spring Boot 2.4.5
- Maven
- Spring Data JPA
- MariaDB
- Spring Security
- OAuth2

# ERD 설계

![erd](https://user-images.githubusercontent.com/115692844/214132241-e928536e-a098-4135-86e8-459a0f290ea0.png)

# 핵심 기능

- 로그인/회원가입  

![로그인](https://user-images.githubusercontent.com/115692844/214156809-9f1afd5b-e759-4cb1-95eb-f6074c6e96c7.png)  
![회원가입](https://user-images.githubusercontent.com/115692844/214156836-8ae5b599-7d88-4706-ac0f-35d0cbf3575b.png)

- 프로필 페이지
![프로필](https://user-images.githubusercontent.com/115692844/214157470-4cbc0c84-b4b7-499a-b905-e2678105af82.png)

- 회원 정보 변경
![회원 정보 변경](https://user-images.githubusercontent.com/115692844/214157596-6fc7cb72-d590-443c-901c-c889d8c03d00.png)

- 프로필 사진 변경
![프로필업로드](https://user-images.githubusercontent.com/115692844/214157696-95b32eb6-0817-4e15-9399-d94d02846265.png)
![업로드완료](https://user-images.githubusercontent.com/115692844/214157706-c69a7912-b4b5-4198-ad88-913491d020ea.png)

- 게시글 업로드
![사진업로드](https://user-images.githubusercontent.com/115692844/214157809-79bebc54-2a2d-477e-9318-cb4f9999ff6f.png)
![게시글 업로드 완료](https://user-images.githubusercontent.com/115692844/214157903-ce25a0e2-b2fe-45b8-9c7c-a03dffbc42c5.png)

- 좋아요 및 댓글
![좋아요 및 댓글](https://user-images.githubusercontent.com/115692844/214158016-7cdfeb51-61af-4e09-ad95-4e559b150b08.png)

-구독 기능
![구독완료](https://user-images.githubusercontent.com/115692844/214158146-bde681a5-da1b-4bcc-aa87-388ffbd075bc.png)
![구독정보](https://user-images.githubusercontent.com/115692844/214158155-02ae7d1c-ca4e-4e54-9f48-1519727e756b.png)

-좋아요 순으로 인기 게시글 정렬
![좋아요 순](https://user-images.githubusercontent.com/115692844/214158301-67a5d44e-5235-496d-9e3f-cc3632c036d9.png)

# 프로젝트 후기
 프로젝트를 진행하며 이론을만 배웠던 jpa를 실제로 활용 할 수 있어 더 깊은 이해를 할 수 있었다.
 연관관계를 실제로 활용하는 법을 알게 되었으며 특히 N:N 관계를 N:1 1:N으로 바꾸어 좀 더 간편하게 설정할 수 있는 부분을 이해하게 되었다.
 스프링 시큐리티와 OAuth2를 어떻게 사용하는 지는 알게 되었으나 깊은 이해를 하지 못했다고 생각하여 따로 공부를 해야 할 필요성을 느끼게 되었다.
