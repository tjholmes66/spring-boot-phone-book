package com.tomholmes.springboot.phonebook.server.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tomholmes.springboot.phonebook.server.domain.ContactEntity;

@Repository("contactDao")
public interface ContactDao extends CrudRepository<ContactEntity, Long>
{

    /*
    ContactEntity createContactEntity(ContactEntity contactEntity);
    
    ContactEntity updateContactEntity(ContactEntity contactEntity);
    
    void deleteContactEntity(long contactId);
    
    void deleteContactEntity(ContactEntity contactEntity);
    
    List<ContactEntity> getAllContactEntitys();
    
    ContactEntity getContactEntity(long id);
    
    List<ContactEntity> getContactEntityByUser(UserEntity exampleEntity);
    
    List<ContactEntity> getContactEntity(ContactEntity exampleEntity);
    */

}
