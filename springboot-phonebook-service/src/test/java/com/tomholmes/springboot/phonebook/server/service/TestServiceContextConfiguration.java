package com.tomholmes.springboot.phonebook.server.service;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = "classpath:application.properties")
@EntityScan("com.tomholmes.springboot.phonebook.server.domain")
public class TestServiceContextConfiguration
{

}