package com.tomholmes.springboot.phonebook.server.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.tomholmes.springboot.phonebook.server.domain.EmailTypeEntity;

public class EmailTypeDaoTest extends BaseDaoTests
{
    @Autowired
    private EmailTypeDao emailTypeDao;

    @Test
    public void testEmailTypeSave()
    {
        System.out.println("testEmailTypeSave: START");
        // =================================================================================
        String emailTypeName = "Test";
        boolean emailActive = true;
        String emailTypeDescription = "Test Description";
        // =================================================================================
        EmailTypeEntity emailType = new EmailTypeEntity();
        emailType.setId(0);
        emailType.setActive(emailActive);
        emailType.setDescription(emailTypeDescription);
        System.out.println("testEmailTypeSave: " + emailTypeName + " " + emailTypeDescription);
        // ***************************************************************
        System.out.println("testEmailTypeSave: START: CREATE");
        emailType = emailTypeDao.save(emailType);
        assertNotNull(emailType);
        System.out.println("testEmailTypeSave: FINISH: CREATE");
        // =================================================================================
    }

    @Test
    public void testEmailTypeUpdate()
    {
        System.out.println("testEmailTypeUpdate: START");
        // =================================================================================
        String emailTypeName = "Test Upd";
        boolean emailActive = true;
        String emailTypeDescription = "Test Description Update";
        // =================================================================================
        EmailTypeEntity emailType = new EmailTypeEntity();
        emailType.setId(0);
        emailType.setActive(emailActive);
        emailType.setDescription(emailTypeDescription);
        System.out.println("testEmailTypeUpdate: " + emailTypeName + " " + emailTypeDescription);
        // ***************************************************************
        System.out.println("testEmailTypeUpdate: START: CREATE");
        emailType = emailTypeDao.save(emailType);
        assertNotNull(emailType);
        assertEquals(emailActive, emailType.isActive());
        assertEquals(emailTypeDescription, emailType.getDescription());
        System.out.println("testEmailTypeUpdate: FINISH: CREATE");
        // =================================================================================
    }

    @Test
    public void testEmailTypeRetrieve()
    {
        System.out.println("testEmailTypeRetrieve: START");
        // =================================================================================
        // =================================================================================
        // ***************************************************************
        System.out.println("testEmailTypeRetrieve: START: CREATE");
        List<EmailTypeEntity> emailTypes = (List<EmailTypeEntity>) emailTypeDao.findAll();
        assertNotNull(emailTypes);
        for (EmailTypeEntity emailType : emailTypes)
        {
            assertNotNull(emailType.getId());
            assertNotNull(emailType.isActive());
            assertNotNull(emailType.getDescription());
            System.out.println("testEmailTypeRetrieve: emailType=" + emailType.getId() + " " + emailType.isActive() + " " + emailType.getDescription());
        }
        System.out.println("testEmailTypeRetrieve: FINISH: CREATE");
        // =================================================================================
    }

    @Test
    public void testEmailTypeRetrieveById()
    {
        System.out.println("testEmailTypeRetrieveById: START");
        // =================================================================================
        // =================================================================================
        // ***************************************************************
        System.out.println("testEmailTypeRetrieveById: START: CREATE");
        EmailTypeEntity emailType = emailTypeDao.getOne(1L);
        assertNotNull(emailType.getId());
        assertNotNull(emailType.isActive());
        assertNotNull(emailType.getDescription());
        System.out.println("testEmailTypeRetrieveById: emailType=" + emailType.getId() + " " + emailType.isActive() + " " + emailType.getDescription());
        System.out.println("testEmailTypeRetrieveById: FINISH: CREATE");
        // =================================================================================
    }

    @Test
    public void testEmailTypeDelete()
    {
        System.out.println("testEmailTypeDelete: START");
        // =================================================================================
        long emailTypeId = 4;
        EmailTypeEntity emailType = emailTypeDao.findById(emailTypeId).orElse(null);
        emailTypeDao.delete(emailType);

        EmailTypeEntity emailTypeGet = emailTypeDao.findById(emailTypeId).orElse(null);
        assertEquals(null, emailTypeGet);

        System.out.println("testEmailTypeDelete: FINISH: CREATE");
        // =================================================================================
    }

    /*
    public void X_testEmailTypeEntityByName() {
    	System.out.println("testEmailTypeEntityByName: START");
    	// =================================================================================
    	String interestName1 = "TEST";
    	String interestUuid1 = "AAA";
    	String interestPath1 = "ABC/AAA";
    	EmailTypeEntity interest1 = new EmailTypeEntity();
    	interest1.setEmailTypeEntityName(interestName1);
    	interest1.setEmailTypeEntityUuid(interestUuid1);
    	interest1.setEmailTypeEntityPath(interestPath1);
    	System.out.println("testEmailTypeEntityByName: " + interestName1 + " " + interestUuid1 + " " + interestPath1);
    	interest1 = emailTypeDao.saveEmailTypeEntity(interest1);
    	assertNotNull(interest1);
    	// =================================================================================
    	String interestName2 = "TEST";
    	String interestUuid2 = "BBB";
    	String interestPath2 = "ABC/BBB";
    	EmailTypeEntity interest2 = new EmailTypeEntity();
    	interest2.setEmailTypeEntityName(interestName2);
    	interest2.setEmailTypeEntityUuid(interestUuid2);
    	interest2.setEmailTypeEntityPath(interestPath2);
    	System.out.println("testEmailTypeEntityByName: " + interestName2 + " " + interestUuid2 + " " + interestPath2);
    	interest2 = emailTypeDao.saveEmailTypeEntity(interest2);
    	assertNotNull(interest2);
    	// =================================================================================
    	String interestName3 = "TEST";
    	String interestUuid3 = "BBB";
    	String interestPath3 = "ABC/BBB";
    	EmailTypeEntity interest3 = new EmailTypeEntity();
    	interest3.setEmailTypeEntityName(interestName3);
    	interest3.setEmailTypeEntityUuid(interestUuid3);
    	interest3.setEmailTypeEntityPath(interestPath3);
    	System.out.println("testEmailTypeEntityByName: " + interestName3 + " " + interestUuid3 + " " + interestPath3);
    	interest3 = emailTypeDao.saveEmailTypeEntity(interest3);
    	assertNotNull(interest2);
    	// =================================================================================
    	String interestName = "TEST";
    	List<EmailTypeEntity> interests = emailTypeDao.getEmailTypeEntitysByName(interestName);
    	System.out.println("testEmailTypeEntityByName: interests: size=" + interests.size() );
    	assertEquals(3,interests.size());
    	// =================================================================================
    	System.out.println("testEmailTypeEntityCRUS: START: DELETE");
    	emailTypeDao.deleteEmailTypeEntity(interest1);
    	emailTypeDao.deleteEmailTypeEntity(interest2);
    	emailTypeDao.deleteEmailTypeEntity(interest3);
    	System.out.println("testEmailTypeEntityCRUS: FINISH: DELETE");
    	// =================================================================================
    }
    */

}
