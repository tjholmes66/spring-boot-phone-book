package com.tomholmes.springboot.phonebook.server.service;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.tomholmes.springboot.phonebook.server.ServiceContextConfiguration;

@RunWith(SpringRunner.class)
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
