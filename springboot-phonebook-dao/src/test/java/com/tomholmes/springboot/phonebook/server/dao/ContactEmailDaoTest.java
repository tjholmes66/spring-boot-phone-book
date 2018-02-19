package com.tomholmes.springboot.phonebook.server.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.tomholmes.springboot.phonebook.server.domain.ContactEmailEntity;
import com.tomholmes.springboot.phonebook.server.domain.ContactEntity;
import com.tomholmes.springboot.phonebook.server.domain.EmailTypeEntity;

public class ContactEmailDaoTest extends BaseDaoTests
{
    @Autowired
    private ContactDao contactDao;
    @Autowired
    private ContactEmailDao contactEmailDao;

    private long id = 2;
    private boolean active = true;
    private String address1 = "123 main street";
    private String address2 = "Apt. 456";
    private boolean admin = false;
    private String dob = "11/03/1966";
    private Date birthDate = null;
    private String city = "Randolph";
    private long companyId = 0;
    private String firstName = "first_name";
    private String lastName = "last_name";
    private String password = "password";
    private String username = "username";
    private String prefix = "Mr.";
    private String suffix = "Jr.";
    private String state = "MA";
    private String zip = "12345-1234";
    private String emailNew = "tom@tomholmes.net";
    private String emailUpd = "tholmes@yahoo.com";
    private long emailTypeId = 1;

    private ContactEntity contact;

    @Test
    public void testContactEmailFetchByContactEntity() throws Exception
    {
        System.out.println("testContactEmailFetchByContact: START");
        // ==========================================================================
        ContactEntity contact = new ContactEntity();
        contact.setContactId(5);
        List<ContactEmailEntity> contactEmailList = contactEmailDao.findByContact(contact);
        assertEquals(3, contactEmailList.size());
        // ==========================================================================
        contact = new ContactEntity();
        contact.setContactId(1);
        contactEmailList = contactEmailDao.findByContact(contact);
        assertEquals(0, contactEmailList.size());
        // ==========================================================================
        contact = new ContactEntity();
        contact.setContactId(11); // id does not exist
        contactEmailList = contactEmailDao.findByContact(contact);
        assertEquals(0, contactEmailList.size());
        // ==========================================================================
        System.out.println("testContactEmailFetchByContact: FINISH");
    }

    @Test
    public void testCreate() throws Exception
    {
        System.out.println("testCreate: START");
        // =================================================================================
        EmailTypeEntity emailType = new EmailTypeEntity();
        emailType.setId(emailTypeId);
        contact = contactDao.findOne(id);
        // =================================================================================
        ContactEmailEntity contactEmail = new ContactEmailEntity();
        // contactEmail.setId(id);
        contactEmail.setContact(contact);
        contactEmail.setEmail(emailNew);
        contactEmail.setEnteredDate(new Date());
        contactEmail.setEmailType(emailType);
        System.out.println("testCreate: " + contactEmail.toString());
        // ***************************************************************
        System.out.println("testCreate: START: CREATE");
        contactEmail = contactEmailDao.save(contactEmail);
        assertNotNull(contactEmail);
        System.out.println("testCreate: FINISH: CREATE");
        // =================================================================================
        contactEmailDao.delete(contactEmail);
        // =================================================================================
    }

    @Test
    public void testContactRetrieve()
    {
        System.out.println("testContactRetrieve: START");
        // =================================================================================
        // =================================================================================
        // ***************************************************************
        System.out.println("testContactRetrieve: START: CREATE");
        List<ContactEmailEntity> contactEmails = (List<ContactEmailEntity>) contactEmailDao.findAll();
        assertNotNull(contactEmails);
        for (ContactEmailEntity contactEmail : contactEmails)
        {
            assertNotNull(contactEmail.getEmailId());
            assertNotNull(contactEmail.getContact());
            assertNotNull(contactEmail.getEmailType());
            // ************************************************************
            // assertEquals(4, contactEmail.getContact().getContactId());
            // assertEquals(1, contactEmail.getEmailType().getId());
            // ************************************************************
            System.out.println("testContactRetrieve: contactEmail=" + contactEmail.toString());
        }
        System.out.println("testContactRetrieve: FINISH: CREATE");
        // =================================================================================
    }

    @Test
    public void testContactRetrieveById()
    {
        System.out.println("testContactRetrieveById: START");
        // =================================================================================
        // =================================================================================
        // ***************************************************************
        System.out.println("testContactRetrieveById: START: CREATE");
        ContactEmailEntity contactEmail = contactEmailDao.findOne(id);
        assertNotNull(contactEmail.getEmailId());
        // ************************************************************
        assertNotNull(contactEmail.getEmailId());
        assertNotNull(contactEmail.getContact());
        assertNotNull(contactEmail.getEmailType());
        // ************************************************************
        assertEquals(4, contactEmail.getContact().getContactId());
        assertEquals(2, contactEmail.getEmailType().getId());
        // ************************************************************
        System.out.println("testContactRetrieve: contactEmail=" + contactEmail.toString());
        System.out.println("testContactRetrieveById: FINISH: CREATE");
        // =================================================================================
    }

    public void XtestContactDelete()
    {
        System.out.println("testContactDelete: START");
        // =================================================================================
        ContactEmailEntity contactEmail;
        ContactEmailEntity contactEmailGet;
        // =================================================================================
        // ***************************************************************
        long id = 10;
        contactEmail = contactEmailDao.findOne(id);
        contactEmailDao.delete(contactEmail);
        contactEmailGet = contactEmailDao.findOne(id);
        assertEquals(null, contactEmailGet);
        // ***************************************************************
        System.out.println("testContactDelete: FINISH: CREATE");
        // =================================================================================
    }

    /*
    public void X_testContactEmailEntityByName() {
    	System.out.println("testContactEmailEntityByName: START");
    	// =================================================================================
    	String interestName1 = "TEST";
    	String interestUuid1 = "AAA";
    	String interestPath1 = "ABC/AAA";
    	ContactEmailEntity interest1 = new ContactEmailEntity();
    	interest1.setContactEmailEntityName(interestName1);
    	interest1.setContactEmailEntityUuid(interestUuid1);
    	interest1.setContactEmailEntityPath(interestPath1);
    	System.out.println("testContactEmailEntityByName: " + interestName1 + " " + interestUuid1 + " " + interestPath1);
    	interest1 = contactEmailDao.saveContactEmailEntity(interest1);
    	assertNotNull(interest1);
    	// =================================================================================
    	String interestName2 = "TEST";
    	String interestUuid2 = "BBB";
    	String interestPath2 = "ABC/BBB";
    	ContactEmailEntity interest2 = new ContactEmailEntity();
    	interest2.setContactEmailEntityName(interestName2);
    	interest2.setContactEmailEntityUuid(interestUuid2);
    	interest2.setContactEmailEntityPath(interestPath2);
    	System.out.println("testContactEmailEntityByName: " + interestName2 + " " + interestUuid2 + " " + interestPath2);
    	interest2 = contactEmailDao.saveContactEmailEntity(interest2);
    	assertNotNull(interest2);
    	// =================================================================================
    	String interestName3 = "TEST";
    	String interestUuid3 = "BBB";
    	String interestPath3 = "ABC/BBB";
    	ContactEmailEntity interest3 = new ContactEmailEntity();
    	interest3.setContactEmailEntityName(interestName3);
    	interest3.setContactEmailEntityUuid(interestUuid3);
    	interest3.setContactEmailEntityPath(interestPath3);
    	System.out.println("testContactEmailEntityByName: " + interestName3 + " " + interestUuid3 + " " + interestPath3);
    	interest3 = contactEmailDao.saveContactEmailEntity(interest3);
    	assertNotNull(interest2);
    	// =================================================================================
    	String interestName = "TEST";
    	List<ContactEmailEntity> interests = contactEmailDao.getContactEmailEntitysByName(interestName);
    	System.out.println("testContactEmailEntityByName: interests: size=" + interests.size() );
    	assertEquals(3,interests.size());
    	// =================================================================================
    	System.out.println("testContactEmailEntityCRUS: START: DELETE");
    	contactEmailDao.deleteContactEmailEntity(interest1);
    	contactEmailDao.deleteContactEmailEntity(interest2);
    	contactEmailDao.deleteContactEmailEntity(interest3);
    	System.out.println("testContactEmailEntityCRUS: FINISH: DELETE");
    	// =================================================================================
    }
    */

    // @Test
    public void testContactUpdate()
    {
        System.out.println("testContactUpdate: START");
        // =================================================================================
        String updateCity = "Randolph";
        String updateFirstName = "updated_fn";
        String updateLastName = "updated_ln";
        String updatePassword = "updated_pwd";
        String updateUsername = "updated_username";
        // =================================================================================
        ContactEmailEntity contactEmail = contactEmailDao.findOne(id);
// assertEquals(contactEmail.getAddress1(),address1);
// assertEquals(contactEmail.getAddress2(),address2);
// assertEquals(contactEmail.getCity(),city);
// assertEquals(contactEmail.getCompanyId(),companyId);
// assertEquals(contactEmail.getFirstName(),firstName);
// assertEquals(contactEmail.getId(),id);
// assertEquals(contactEmail.getLastName(),lastName);
// //assertEquals(contactEmail.getMiddleName(),middleName);
// assertEquals(contactEmail.getPassword(),password);
// assertEquals(contactEmail.getPrefix(),prefix);
// assertEquals(contactEmail.getState(),state);
// assertEquals(contactEmail.getSuffix(),suffix);
// assertEquals(contactEmail.getUsername(),username);
// assertEquals(contactEmail.getZip(),zip);
        System.out.println("testContactUpdate: " + contactEmail.toString());
        // ***************************************************************
// contactEmail.setCity(updateCity);
// contactEmail.setFirstName(updateFirstName);
// contactEmail.setLastName(updateLastName);
// contactEmail.setPassword(updatePassword);
// contactEmail.setUsername(updateUsername);
// ***************************************************************
        System.out.println("testContactUpdate: START: CREATE");
        contactEmail = contactEmailDao.save(contactEmail);
        assertNotNull(contactEmail);
// assertEquals(contactEmail.getCity(),updateCity);
// assertEquals(contactEmail.getFirstName(),updateFirstName);
// assertEquals(contactEmail.getLastName(),updateLastName);
// assertEquals(contactEmail.getPassword(),updatePassword);
// assertEquals(contactEmail.getUsername(),updateUsername);
        System.out.println("testContactUpdate: FINISH: CREATE");
        // =================================================================================
    }

}
