# MineCraft-Demo-Plugin
⛏ 마인크래프트 플러그인 만들어보기 ⛏

## 필요 셋팅
- MineCraft 1.19.2
- spigot API 라이브러리
- 인텔리제이
- Gradle 7.5
- JDK 18

## 1. 인텔리제이 프로젝트 셋팅
[New ProJect] -> [Gradle] -> [Java 체크] -> [Project SDK가 JDK 18 버전인지 확인]

![스크린샷 2022-10-18 오후 4 47 14](https://user-images.githubusercontent.com/80299170/196368694-ee96ee80-ccec-43dc-88a5-e9ccbd449d0c.png)

### 1-1. JDK 버전이 다르거나 JDK가 깔려있지 않다면?

[Project SDK 클릭] -> [Download JDK 클릭] -> [Version -> 18] -> [Amazon Corretto 18.0.2 클릭]

(Oracle JDK 18을 선택하고 싶었으나 오라클 공식 홈페이지에서 M1을 지원해주는 JDK가 19버전이 나오면서 사라진거 같다 ㅠ )

### 1-2. Java 버전 확인
[터미널 or Cmd 실행] -> `java -version` 입력하고 확인

![스크린샷 2022-10-18 오후 4 20 45](https://user-images.githubusercontent.com/80299170/196371826-753db8a7-e6b7-40db-82f6-0a8abafe390e.png)

## 2. JDK 18 까지 설정 후 [Next] 버튼을 누르면 뜬다.

![스크린샷 2022-10-18 오후 5 02 37](https://user-images.githubusercontent.com/80299170/196372192-49cf66a2-4e99-46a9-87c4-99e07dfc7514.png)

'Gradle 7.1 버전은 자바 18버전은 지원해주지 않는다'라고 하는데 프로젝트 생성 후 Gradle 업글레이드 해주면 되기 때문에 일단 무시




