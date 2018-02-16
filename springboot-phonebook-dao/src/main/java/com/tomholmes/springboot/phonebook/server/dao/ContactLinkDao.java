package com.tomholmes.springboot.phonebook.server.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tomholmes.springboot.phonebook.server.domain.ContactLinkEntity;

@Repository("contactLinkDao")
public interface ContactLinkDao extends CrudRepository<ContactLinkEntity, Long>
{

    /*
    public ContactLinkEntity saveContactLinkEntity(ContactLinkEntity contactLink);
    
    public ContactLinkEntity createContactLinkEntity(ContactLinkEntity contactLink);
    
    public ContactLinkEntity updateContactLinkEntity(ContactLinkEntity contactLink);
    
    public void deleteContactLinkEntity(Long contactLinkId);
    
    public void deleteContactLinkEntity(ContactLinkEntity contactLink);
    
    public List<ContactLinkEntity> getAllContactLinkEntitys();
    
    // Retrieve
    public ContactLinkEntity getContactLinkEntity(long id);
    
    public List<ContactLinkEntity> getContactLinkEntity(ContactLinkEntity exampleEntity);
    
    public List<ContactLinkEntity> getContactLinkEntityByContact(ContactEntity exampleContactEntity);
    
    public List<ContactLinkEntity> getContactLinkEntityByContactId(long contactId);
    */

}
