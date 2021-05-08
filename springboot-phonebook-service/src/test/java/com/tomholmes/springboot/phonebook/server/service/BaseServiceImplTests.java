package com.tomholmes.springboot.phonebook.server.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.SimpleDateFormat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.tomholmes.springboot.phonebook.server.ServiceContextConfiguration;

@SpringBootTest(classes = ServiceContextConfiguration.class)
@Transactional
public class BaseServiceImplTests
{
    private SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

    @Test
    public void test()
    {
        assertEquals(true, true);
    }

}
