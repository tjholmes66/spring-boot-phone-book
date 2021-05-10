package com.tomholmes.springboot.phonebook.server;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

// @Configuration
// @ComponentScan(basePackages ={ "com.tomholmes.springboot.phonebook.server" })
// @PropertySource(value = "classpath:application.properties")
// @EntityScan("com.tomholmes.springboot.phonebook.server.domain")
// @EnableJpaRepositories(basePackages = "com.tomholmes.springboot.phonebook.server.dao")

@Configuration
@PropertySource(value = "classpath:application.properties")
@EnableAutoConfiguration
public class RepositoryContextConfiguration
{

}
