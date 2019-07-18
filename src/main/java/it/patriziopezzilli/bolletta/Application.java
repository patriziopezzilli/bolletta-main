package it.patriziopezzilli.bolletta;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class Application {

    public static void main(String[] args) throws Exception {

        // Start Spring boot application
        ConfigurableApplicationContext run = SpringApplication.run(Start.class, args);
    }
}
