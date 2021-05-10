package com.tomholmes.springboot.phonebook.server.dao;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import com.tomholmes.springboot.phonebook.server.RepositoryContextConfiguration;
import com.tomholmes.springboot.phonebook.server.domain.CompanyEntity;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = RepositoryContextConfiguration.class)
@ComponentScan("com.tomholmes.springboot.phonebook.server")
@Transactional
public class CompanyDaoTest
{
    @Autowired
    private CompanyDao companyDao;

    @Test
    public void testGetById()
    {
        long companyId = 1;
        CompanyEntity companyEntity = companyDao.findById(companyId).orElse(null);
        assertNotNull(companyEntity);
    }
}
