package com.slash.swagger;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

//http://localhost:8080/swagger-ui/index.html
//http://localhost:8080/api-docs
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public DataSource dataSource() {
        SQLServerDataSource dataSource = new SQLServerDataSource();
        dataSource.setServerName("localhost");
        dataSource.setDatabaseName("Swagger");
        dataSource.setUser("sa");
        dataSource.setPassword("Password123$");
        dataSource.setTrustServerCertificate(true);
        return dataSource;
    }
}
