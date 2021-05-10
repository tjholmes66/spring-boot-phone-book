package com.tomholmes.springboot.phonebook.server.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tomholmes.springboot.phonebook.server.dao.ContactDao;
import com.tomholmes.springboot.phonebook.server.domain.ContactEntity;
import com.tomholmes.springboot.phonebook.server.domain.UserEntity;

@Transactional
@Service("contactService")
public class ContactServiceImpl implements ContactService
{
    @Autowired
    private ContactDao contactDao;

    @Override
    public List<ContactEntity> getAllContacts()
    {
        List<ContactEntity> contactList = (List<ContactEntity>) contactDao.findAll();
        return contactList;
    }

    @Override
    public List<ContactEntity> getContactsByUserId(long userId)
    {
        UserEntity userEntity = new UserEntity();
        userEntity.setUserId(userId);
        List<ContactEntity> contactList = contactDao.findByUser(userEntity);
        return contactList;
    }

    @Override
    public ContactEntity getContactById(long contactId)
    {
        ContactEntity contactEntity = contactDao.findById(contactId).orElse(null);
        return contactEntity;
    }

    @Override
    public ContactEntity add(ContactEntity newContact)
    {
        ContactEntity contactEntity = contactDao.save(newContact);
        return contactEntity;
    }

    @Override
    public ContactEntity update(ContactEntity newContact)
    {
        ContactEntity updatedContactEntity = contactDao.save(newContact);
        return updatedContactEntity;
    }

    @Override
    public void remove(long contactId)
    {
        System.out.println("remove: contactId=" + contactId);
        contactDao.deleteById(contactId);
    }

}
