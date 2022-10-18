# MineCraft-Demo-Plugin
⛏ 마인크래프트 플러그인 만들어보기 ⛏

## 구현 기능
### 서버 입장 시 타이틀
![ezgif com-gif-maker](https://user-images.githubusercontent.com/80299170/196383348-723f89a3-9929-4fb5-902e-a1165db7170b.gif)

### 커스텀한 명령어로 현재 플레이어 좌표 리턴



![ezgif com-gif-maker (1)](https://user-images.githubusercontent.com/80299170/196387086-7faa387b-0da9-4952-a036-43218a531b2e.gif)

## 필요 셋팅
- MineCraft 1.19.2
- spigot API 라이브러리
- 인텔리제이
- Gradle 7.5
- JDK 18

## 마인크래프트 서버 다운로드 및 기본 설정
- [다운로드 링크](https://getbukkit.org/get/7d4d4901bb1f641da6a9882c69d5fd54)
- [서버 기본 설정](https://blackdol.tistory.com/m/13) 

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

'Gradle 7.1 버전은 자바 18버전은 지원해주지 않는다'라고 하는데 프로젝트 생성 후 Gradle 업그레이드 해주면 되기 때문에 일단 무시 후 [Yes] 클릭 -> [프로젝트 이름 설정] -> [Finish]

## 3. Gradle 버전을 바꾸자
프로젝트 맨 하단에 [Terminal] 클릭 -> gradlew와 같은 경로에 있는지 확인 -> (Mac 기준)`./gradlew wrapper --gradle-version 7.5` 입력 후 build successful! 초록색 문장이 뜬다면 성공!


(Mac 기준) 버전 확인
`./gradlew -v` 7.5 인지 버전 확인


![스크린샷 2022-10-18 오후 5 14 06](https://user-images.githubusercontent.com/80299170/196374830-eb9252f3-475c-410f-bd4e-1ba8ebc4dcce.png)

## 4. build.gradle 설정
```Groovy
plugins {
    id 'java'
}

group 'org.example'
version '1.0-SNAPSHOT'

repositories {
    mavenCentral()
    maven {
        url "https://hub.spigotmc.org/nexus/content/repositories/snapshots/" // URL 
    }
}

dependencies {
    testImplementation 'org.junit.jupiter:junit-jupiter-api:5.7.0'
    testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine:5.7.0'
    implementation "org.spigotmc:spigot-api:1.19.2-R0.1-SNAPSHOT" // 마인크래프트 버전에 맞게 설정
}

test {
    useJUnitPlatform()
}
```

주석처리한 곳들만 추가해주면 된다. -> 우측상단에 코끼리 모양 클릭 하여 라이브러리 다운로드

## 5. 프로젝트 안에 src 폴더가 없다면?
- [참고 링크] (https://torbjorn.tistory.com/m/723)

## 6. plugin.yml 작성
main 패키지 안에 resource 폴더 안에 작성

```YAML
name: JKPlugin # 플러그인 이름 (필수)
version: 1.0 # 플러그인 버전 (필수)
author: JINKI # 작성자
description: Frist MineCreft plugin # 설명
main: com.example.demo.Main # 실행할 클래스 이름과 동일 해야함(저자는 Main 클래스 사용 중) (필수)
```






