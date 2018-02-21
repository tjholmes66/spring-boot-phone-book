package com.tomholmes.springboot.phonebook.server.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tomholmes.springboot.phonebook.server.dao.ContactEmailDao;
import com.tomholmes.springboot.phonebook.server.domain.ContactEmailEntity;
import com.tomholmes.springboot.phonebook.server.domain.ContactEntity;

@Transactional
@Service("contactEmailService")
public class ContactEmailServiceImpl implements ContactEmailService
{
    @Autowired
    private ContactEmailDao contactEmailDao;

    @Override
    public List<ContactEmailEntity> getAllEmailsByContactId(long contactId)
    {
        ContactEntity contact = new ContactEntity();
        contact.setContactId(contactId);
        List<ContactEmailEntity> contactEmailList = contactEmailDao.findByContact(contact);
        return contactEmailList;
    }

    @Override
    public List<ContactEmailEntity> getAllEmailsByContactId(ContactEntity contactEntity)
    {
        List<ContactEmailEntity> contactEmailList = contactEmailDao.findByContact(contactEntity);
        return contactEmailList;
    }

    @Override
    public ContactEmailEntity getEmailContactById(long emailId)
    {
        ContactEmailEntity contactEmailEntity = contactEmailDao.findOne(emailId);
        return contactEmailEntity;
    }
}
