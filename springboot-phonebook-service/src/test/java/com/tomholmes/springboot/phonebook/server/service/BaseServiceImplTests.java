package com.tomholmes.springboot.phonebook.server.service;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestServiceContextConfiguration.class)
@ComponentScan("com.tomholmes.springboot.phonebook.server")
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
