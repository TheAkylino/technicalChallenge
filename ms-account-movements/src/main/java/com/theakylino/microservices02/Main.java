package com.theakylino.microservices02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.theakylino.hexagonal")
public class Main {

  public static void main(String[] args) {
    SpringApplication.run(Main.class, args);
  }

}
