package com.tomholmes.springboot.phonebook.server.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tomholmes.springboot.phonebook.server.domain.EmailTypeEntity;

@Repository("emailTypeDao")
public interface EmailTypeDao extends CrudRepository<EmailTypeEntity, Long>
{

    /*
    public EmailTypeEntity saveEmailTypeEntity(EmailTypeEntity emailType);
    
    public void deleteEmailTypeEntity(Long emailTypeId);
    
    public void deleteEmailTypeEntity(EmailTypeEntity emailType);
    
    public List<EmailTypeEntity> getAllEmailTypeEntitys();
    
    // Retrieve
    public EmailTypeEntity getEmailTypeEntity(long id);
    
    public List<EmailTypeEntity> getEmailTypeEntity(EmailTypeEntity exampleEntity);
    */

}
