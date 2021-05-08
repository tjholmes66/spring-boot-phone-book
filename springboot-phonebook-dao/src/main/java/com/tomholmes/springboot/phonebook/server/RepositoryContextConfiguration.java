package com.tomholmes.springboot.phonebook.server;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
@ComponentScan(basePackages =
{ "com.tomholmes.springboot.phonebook.server" })
@PropertySource(value = "classpath:application.properties")
@EntityScan("com.tomholmes.springboot.phonebook.server.domain")
@EnableJpaRepositories(basePackages = "com.tomholmes.springboot.phonebook.server.dao")
public class RepositoryContextConfiguration
{

    @Bean(name = "entityManagerFactory")
    public LocalSessionFactoryBean sessionFactory()
    {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        return sessionFactory;
    }

}
