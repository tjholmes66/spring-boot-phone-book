package com.tomholmes.springboot.phonebook.server.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tomholmes.springboot.phonebook.server.domain.ContactEmailEntity;

@Repository("contactEmailDao")
public interface ContactEmailDao extends CrudRepository<ContactEmailEntity, Long>
{

    /*
    public ContactEmailEntity saveContactEmailEntity(ContactEmailEntity contactEmail);
    
    public ContactEmailEntity createContactEmailEntity(ContactEmailEntity contactEmail);
    
    public ContactEmailEntity updateContactEmailEntity(ContactEmailEntity contactEmail);
    
    public void deleteContactEmailEntity(Long contactEmailId);
    
    public void deleteContactEmailEntity(ContactEmailEntity contactEmail);
    
    public List<ContactEmailEntity> getAllContactEmailEntitys();
    
    // Retrieve
    public ContactEmailEntity getContactEmailEntity(long id);
    
    public List<ContactEmailEntity> getContactEmailEntity(ContactEmailEntity exampleEntity);
    
    public List<ContactEmailEntity> getContactEmailEntityByContact(ContactEntity exampleContactEntity);
    
    public List<ContactEmailEntity> getContactEmailEntityByContactId(long contactId);
    */

}
