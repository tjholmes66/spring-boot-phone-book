package com.tomholmes.springboot.phonebook.server.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tomholmes.springboot.phonebook.server.domain.ContactPhoneEntity;

@Repository("contactPhoneDao")
public interface ContactPhoneDao extends CrudRepository<ContactPhoneEntity, Long>
{

    /*
    public ContactPhoneEntity saveContactPhoneEntity(ContactPhoneEntity contactPhone);
    
    public ContactPhoneEntity createContactPhoneEntity(ContactPhoneEntity contactPhone);
    
    public ContactPhoneEntity updateContactPhoneEntity(ContactPhoneEntity contactPhone);
    
    public void deleteContactPhoneEntity(Long contactPhoneId);
    
    public void deleteContactPhoneEntity(ContactPhoneEntity contactPhone);
    
    public List<ContactPhoneEntity> getAllContactPhoneEntitys();
    
    // Retrieve
    public ContactPhoneEntity getContactPhoneEntity(long id);
    
    public List<ContactPhoneEntity> getContactPhoneEntity(ContactPhoneEntity exampleEntity);
    
    public List<ContactPhoneEntity> getContactPhoneEntityByContact(ContactEntity exampleContactEntity);
    
    public List<ContactPhoneEntity> getContactPhoneEntityByContactId(long contactId);
    */

}
