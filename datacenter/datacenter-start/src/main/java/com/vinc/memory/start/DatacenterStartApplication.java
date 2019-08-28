package com.vinc.memory.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//@SpringBootApplication
@SpringBootApplication(scanBasePackages = "com.vinc.memory")
public class DatacenterStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatacenterStartApplication.class, args);
    }

}
