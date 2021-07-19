package kr.ac.hansung.cse.hellospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication // 매우 중요
public class HellospringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(HellospringbootApplication.class, args);
    }

}