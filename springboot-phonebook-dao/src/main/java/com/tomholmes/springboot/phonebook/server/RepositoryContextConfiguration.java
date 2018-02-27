package com.tomholmes.springboot.phonebook.server;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@Configuration
@ComponentScan( basePackages =  {"com.tomholmes.springboot.phonebook.server"}  )
@PropertySource(value = "classpath:application.properties")
@EntityScan("com.tomholmes.springboot.phonebook.server.domain")
public class RepositoryContextConfiguration
{

}
