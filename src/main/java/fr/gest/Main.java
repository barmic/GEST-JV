package fr.gest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * This class is runner of application.
 * Initialize Spring Boot with all default configuration.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Main {

  public static void main(String[] args) {
    SpringApplication.run(Main.class, args);
  }
}
