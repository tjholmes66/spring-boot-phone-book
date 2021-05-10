package com.tomholmes.springboot.phonebook.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class PhoneBookApp
{
    public static void main(String[] args)
    {
        SpringApplication.run(PhoneBookApp.class, args);
    }
}
