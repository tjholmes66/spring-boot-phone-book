package com.tomholmes.springboot.phonebook.server;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:application.properties")
@EnableAutoConfiguration
@ComponentScan(basePackages =
{ "com.tomholmes.springboot.phonebook.server" })
public class ServiceContextConfiguration
{

}
