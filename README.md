# springboot-study
* 스프링부트에 입문하며 처음 도전한 프로젝트입니다.
* 소셜 로그인을 통해 사용할 수 있는 CRUD게시판입니다. 
* AWS ec2를 활용하여 배포하였으며 프리티어인 관계로 인스턴스를 자주 꺼서 접속이 안 될 수 있습니다.
* http://ec2-3-36-163-12.ap-northeast-2.compute.amazonaws.com:8080/

이동욱님의 블로그를 참고하여 개발했습니다. https://jojoldu.tistory.com/250?category=635883

## 개발환경
* IDE : IntelliJ IDEA Pro
* Git Tools : Source Tree
* OS : Window
* SpringBoot 2.1.7
* Java8
* Gradle

## 적용한 기술
* JUnit 테스트
* JPA
* Gradle
* 스프링 시큐리티, OAuth2.0 소셜 로그인(구글, 네이버)
* AWS ec2, RDS(MySQL), s3
* 머스테치 : 서버 템플릿 엔진
* Travis CI, Codedeploy : CI & CD
* NginX : 무중단 배포

## Dependencies
* Core의 Lombok
* Web의 Web
* SQL의 JPA, H2
* OPS의 Actuators
