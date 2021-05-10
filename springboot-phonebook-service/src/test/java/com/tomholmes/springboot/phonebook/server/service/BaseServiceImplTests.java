package com.tomholmes.springboot.phonebook.server.service;

import java.text.SimpleDateFormat;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import com.tomholmes.springboot.phonebook.server.ServiceContextConfiguration;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = ServiceContextConfiguration.class)
@ComponentScan("com.tomholmes.springboot.phonebook.server")
@Transactional
public class BaseServiceImplTests
{
    private SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

    /*
    @Test
    public void test()
    {
        assertEquals(true, true);
    }
    */

}
