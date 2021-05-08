package com.tomholmes.springboot.phonebook.server.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.tomholmes.springboot.phonebook.server.domain.ContactEmailEntity;
import com.tomholmes.springboot.phonebook.server.domain.ContactEntity;
import com.tomholmes.springboot.phonebook.server.domain.EmailTypeEntity;

public class ContactEmailServiceImplTest extends BaseServiceImplTests
{
    @Autowired
    private ContactEmailService service;

    private final static int id = 0;
    private final static String prefix = "Mr.";
    private final static String firstname = "Thomas";
    private final static String middlename = "Joseph";
    private final static String lastname = "Holmes";
    private final static String suffix = "Jr.";

    private final static String address1 = "42 Wheeler Circle";
    private final static String address2 = "Apartment 38";
    private final static String city = "Stoughton";
    private final static String state = "MA";
    private final static String zip = "02072";

    private final static long enteredBy = 1;
    private final static Date enteredDate = new Date();
    private final static long editedBy = 1;
    private final static Date editedDate = new Date();

    private final static Date birthDate = new Date();
    private final static boolean admin = false;

    private final static String email = "111-222-1234";
    private final static long emailTypeId = 1;

    private ContactEmailEntity createContactEmailDto()
    {
        long contactId = 4;
        ContactEntity contactEntity = new ContactEntity();
        contactEntity.setContactId(contactId);
        // ============================================================
        ContactEmailEntity contactEmailDto = new ContactEmailEntity();
        contactEmailDto.setContact(contactEntity);
        contactEmailDto.setEmailId(id);
        contactEmailDto.setEnteredDate(enteredDate);
        contactEmailDto.setEmail(email);

        EmailTypeEntity emailType = new EmailTypeEntity();
        emailType.setId(emailTypeId);
        contactEmailDto.setEmailType(emailType);

        return contactEmailDto;
    }

// @Test
// public void testCreateContactEmail() throws Exception
// {
// System.out.println("testCreateContactEmail: START");
// ContactEmailEntity contactEmailDto = createContactEmailDto();
// // ==================================================
// ContactEmailEntity newContactEmailDto = service.add(contactEmailDto);
// assertNotNull(newContactEmailDto);
// // ==================================================
// System.out.println("testCreateContactEmail: FINISH");
// }

    @Test
    public void testRetrieveEmailsByContactDto1() throws Exception
    {
        System.out.println("testFetchByContactExample1: START");
        long contactId = 1;
        ContactEntity contactEntity = new ContactEntity();
        contactEntity.setContactId(contactId);
        // ==================================================
        List<ContactEmailEntity> contactEmails = service.getAllEmailsByContactId(contactEntity.getContactId());
        ContactEmailEntity contactEmail = null;
        if (contactEmails != null)
        {
            System.out.println("testFetchByContactExample1: contacts: size=" + contactEmails.size());
            System.out.println("testFetchByContactExample1: contacts=" + contactEmails.toString());

            if (contactEmails.size() > 0)
            {
                contactEmail = contactEmails.get(0);
                System.out.println("testFetchByContactExample1: contactEmail: id=" + contactEmail.getEmailId());
                System.out.println("testFetchByContactExample1: contactEmail: contactId=" + contactEmail.getContact().getContactId());
                System.out.println("testFetchByContactExample1: contactEmail: email=" + contactEmail.getEmail());
                System.out.println("testFetchByContactExample1: contactEmail=" + contactEmail.toString());
            }
        }
        assertNotNull(contactEmails);
        // ==================================================
        System.out.println("testFetchByContactExample: FINISH");
    }

    @Test
    public void testRetrieveEmailsByContactDto2() throws Exception
    {
        System.out.println("testFetchByContactExample1: START");
        long contactId = 4;
        ContactEntity contactEntity = new ContactEntity();
        contactEntity.setContactId(contactId);
        // ==================================================
        List<ContactEmailEntity> contactEmails = service.getAllEmailsByContactId(contactEntity.getContactId());
        ContactEmailEntity contactEmail = null;
        if (contactEmails != null)
        {
            System.out.println("testFetchByContactExample1: contacts: size=" + contactEmails.size());
            System.out.println("testFetchByContactExample1: contacts=" + contactEmails.toString());

            if (contactEmails.size() > 0)
            {
                contactEmail = contactEmails.get(0);
                System.out.println("testFetchByContactExample1: contactEmail: id=" + contactEmail.getEmailId());
                System.out.println("testFetchByContactExample1: contactEmail: contactId=" + contactEmail.getContact().getContactId());
                System.out.println("testFetchByContactExample1: contactEmail: email=" + contactEmail.getEmail());
                System.out.println("testFetchByContactExample1: contactEmail=" + contactEmail.toString());
            }
        }
        assertNotNull(contactEmails);
        // ==================================================
        System.out.println("testFetchByContactExample: FINISH");
    }

    @Test
    public void testFetchById() throws Exception
    {
        System.out.println("testFetchById: START");
        long emailId = 4;
        // ==================================================
        ContactEmailEntity contactEmail = service.getEmailContactById(emailId);
        System.out.println("testFetchByContactExample: contactEmail: id=" + contactEmail.getEmailId());
        System.out.println("testFetchByContactExample: contactEmail: contactId=" + contactEmail.getContact().getContactId());
        System.out.println("testFetchByContactExample: contactEmail: email=" + contactEmail.getEmail());
        System.out.println("contacts=" + contactEmail.toString());
        assertNotNull(contactEmail);
        // ==================================================
        System.out.println("testFetchById: FINISH");
    }

}
