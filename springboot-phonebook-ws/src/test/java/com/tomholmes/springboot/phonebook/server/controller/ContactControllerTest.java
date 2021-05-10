package com.tomholmes.springboot.phonebook.server.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.tomholmes.springboot.phonebook.server.domain.ContactEntity;
import com.tomholmes.springboot.phonebook.server.domain.UserEntity;

public class ContactControllerTest extends BaseControllerTests
{
    private final static String BASE_URL = "/contacts";

    private final static int contactId = 0;
    // =============================================
    private final static String prefix = "Mr.";
    private final static String firstName = "contact_fn1";
    private final static String middleName = "contact_mn1";
    private final static String lastName = "contact_ln1";
    private final static String suffix = "Jr.";
    // =============================================
    private final static String address1 = "123 Main Street";
    private final static String address2 = "Apartment 38A";
    private final static String city = "Boston";
    private final static String state = "MA";
    private final static String zip = "02368-1234";
    // =============================================
    private final static int editedBy = 1;
    private final static Date editedDate = new Date();
    private final static int enteredBy = 1;
    private final static Date enteredDate = new Date();
    // =============================================
    private final static int companyId = 0;
    private final static Date birthDate = new Date();

    // =============================================

    private ContactEntity createContactEntity()
    {
        ContactEntity contactEntity = new ContactEntity();
        contactEntity.setContactId(contactId);
        // =============================================
        contactEntity.setPrefix(prefix);
        contactEntity.setFirstName(firstName);
        contactEntity.setMiddleName(middleName);
        contactEntity.setLastName(lastName);
        contactEntity.setSuffix(suffix);
        // =============================================
        contactEntity.setAddress1(address1);
        contactEntity.setAddress2(address2);
        contactEntity.setCity(city);
        contactEntity.setState(state);
        contactEntity.setZip(zip);
        // =============================================
        contactEntity.setCompanyId(companyId);
        contactEntity.setBirthDate(birthDate);
        // =============================================
        contactEntity.setEditedBy(editedBy);
        contactEntity.setEditedDate(editedDate);
        contactEntity.setEnteredBy(enteredBy);
        contactEntity.setEnteredDate(enteredDate);
        // =============================================
        // contactEntity.setEmails(emails)
        // contactEntity.setPhones(phones)
        // contactEntity.setLinks(links)
        // =============================================
        long userId = 1;
        UserEntity user = new UserEntity();
        user.setUserId(userId);
        // =============================================
        contactEntity.setUser(user);
        // =============================================
        return contactEntity;
    }

    private final static int updId = 9;
    private final static String updEmail = "tom@tomholmes.new";
    private final static int updPositionId = 3;
    private final static String updFirstname = "tom4_upd";
    private final static String updLastname = "holmes4_upd";
    private final static String updPassword = "pass4upd";
    private final static String updSecurityQuestion1 = "question1upd";
    private final static String updSecurityQuestion2 = "question2upd";
    private final static String updSecurityAnswer1 = "answer1upd";
    private final static String updSecurityAnswer2 = "answer2upd";

    /*
    I have the following URIs:
    
        /contacts - Returns all contacts
        /contacts/contact/{id} - Return a specific user
        /contacts/create/{user} - Add user to db
        /contacts/update/{user} - Update user
        /contacts/delete/{id} - Delete Contact
    */

    // @RequestMapping(value = "", method = RequestMethod.GET, headers = "Accept=application/json")
    // public ArrayList<ContactEntity> getContactList1()
    @Test
    public void testGetContactList1() throws Exception
    {
        System.out.println("testGetContactList1: START");
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get(BASE_URL);
        this.mockMvc.perform(requestBuilder).andDo(print()).andExpect(status().isOk());
        System.out.println("testGetContactList1: FINISH");
    }

    // @RequestMapping(value = "/", method = RequestMethod.GET, headers = "Accept=application/json")
    // public @ResponseBody ArrayList<ContactEntity> getContactList2()
    @Test
    public void testGetContactList2() throws Exception
    {
        System.out.println("testGetContactList2: START");
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get(BASE_URL + "/");
        this.mockMvc.perform(requestBuilder).andDo(print()).andExpect(status().isOk());
        System.out.println("testGetContactList2: FINISH");
    }

    // @RequestMapping(value = "/contactId/{contactId}", method = RequestMethod.GET, headers =
    // "Accept=application/json")
    // public @ResponseBody ContactEntity getContactById(@PathVariable("contactId") long contactId)
    @Test
    public void testGetContactById() throws Exception
    {
        System.out.println("testGetContactById: START");
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get(BASE_URL + "/contactId/6");
        this.mockMvc.perform(requestBuilder).andDo(print()).andExpect(status().isOk());
        System.out.println("testGetContactById: FINISH");
    }

    // @RequestMapping(value = "/userId/{userId}", method = RequestMethod.GET, headers = "Accept=application/json")
    // public @ResponseBody

    // @RequestMapping(value = "/create", method = RequestMethod.POST, produces = "application/json",headers =
    // "content-type=application/json")
    // public @ResponseBody

    // @RequestMapping(value = "/update", method = RequestMethod.PUT, produces = "application/json",headers =
    // "content-type=application/json")
    // public @ResponseBody

    // @RequestMapping(value = "/delete/{contactId}", method = RequestMethod.DELETE, headers =
    // "Accept=application/json")
    // public @ResponseBody

}
