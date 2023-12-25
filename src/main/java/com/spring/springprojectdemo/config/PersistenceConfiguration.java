// when this class file is the database configuration file

package com.spring.springprojectdemo.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {
    @Bean
    public DataSource dataSource(){
        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.url("jdbc:mysql://localhost:3306/spring_project_demo");
        builder.username("root");
        builder.password("1234");
        System.out.println("My custom datasource bean has bean initialized and set");
        return builder.build();
    }
}
