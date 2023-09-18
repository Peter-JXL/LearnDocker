package com.peterjxl.learndocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.peterjxl.learndocker.mapper")
public class LearnDockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnDockerApplication.class, args);
    }

}
