package com.gitteacher.unicom.teachergitgithub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class TeachergitgithubApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeachergitgithubApplication.class, args);
    }

}
