package com.tomholmes.springboot.phonebook.server.service;

import java.util.List;

import com.tomholmes.springboot.phonebook.server.domain.ContactEmailEntity;
import com.tomholmes.springboot.phonebook.server.domain.ContactEntity;

public interface ContactEmailService
{
    List<ContactEmailEntity> getAllEmailsByContactId(long contactId);

    ContactEmailEntity getEmailContactById(long emailId);

    List<ContactEmailEntity> getAllEmailsByContactId(ContactEntity contactEntity);

}
