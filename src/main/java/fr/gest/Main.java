package fr.gest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Main {
  private final Logger log = LoggerFactory.getLogger(this.getClass());

  @Value("#{environment.DATABASE_URL?:''}")
  private String database_url;

  @Bean
  public Connection getConnection() throws SQLException {
    throw new RuntimeException("We must call this method !");
//    String username = "";
//    String password = "";
//    String dbUrl = "jdbc:h2:mem:mydb";
//
//    if (database_url != null && !database_url.isEmpty()) {
//      try {
//        URI dbUri = new URI(database_url);
//
//        String[] splitDbInfos = dbUri.getUserInfo().split(":");
//        username = splitDbInfos[0];
//        password = splitDbInfos[1];
//        dbUrl = "jdbc:postgresql://" + dbUri.getHost() + ':' + dbUri.getPort() + dbUri.getPath();
//      } catch (Exception e) {
//        log.warn("Impossible to use DATABASE_URL :  {}; error : {}", database_url, e.getMessage());
//        username = "";
//        password = "";
//        dbUrl = "jdbc:h2:mem:mydb";
//      }
//    }
//
//    log.info("url JDBC used : {}", dbUrl);
//
//    return DriverManager.getConnection(dbUrl, username, password);
  }

  public static void main(String[] args) {
    SpringApplication.run(Main.class, args);
  }
}
