
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

// package com.example.demo; // 현재 폴더 위치
// import org.springframework.boot.SpringApplication; // 스프링 핵심 클래스
// Import org.springframework.boot.autoconfigure.SpringBootApplication; // 자동 설정 기능 활성화
// @SpringBootApplication // 애노테이션(스프링 부트 APP 명시, 하위 다양한 설정을 자동 등록)
// public class DemoApplication { // 클래스 이름
// public static void main(String[] args) { // 메인 메서드(프로그램 시작점)
// SpringApplication.run(DemoApplication.class, args); // run 메서드로 실행
// }
// }
