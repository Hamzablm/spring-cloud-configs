package com.hamzajvm.springconfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringConfigurationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringConfigurationApplication.class, args);
    }

}
