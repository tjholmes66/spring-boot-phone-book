package com.tomholmes.springboot.phonebook.server.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.SimpleDateFormat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import com.tomholmes.springboot.phonebook.server.RepositoryContextConfiguration;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = RepositoryContextConfiguration.class)
@ComponentScan("com.tomholmes.springboot.phonebook.server")
@Transactional
public class BaseDaoTests
{
    private SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

    @Test
    public void test()
    {
        assertEquals(true, true);
    }

}
