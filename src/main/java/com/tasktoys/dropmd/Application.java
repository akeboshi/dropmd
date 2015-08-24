package com.tasktoys.dropmd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author mikan
 */
@SpringBootApplication
@ComponentScan
public class Application {

    public static void main(String[] args) {
        System.out.println("********** current dir: " + System.getProperty("user.dir"));
        SpringApplication.run(Application.class, args);
    }
}
