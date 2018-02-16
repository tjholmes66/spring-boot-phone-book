package com.tomholmes.springboot.phonebook.server.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tomholmes.springboot.phonebook.server.domain.PhoneTypeEntity;

@Repository("phoneTypeDao")
public interface PhoneTypeDao extends CrudRepository<PhoneTypeEntity, Long>
{

    /*
    public PhoneTypeEntity savePhoneTypeEntity(PhoneTypeEntity phoneType);
    
    public void deletePhoneTypeEntity(Long phoneTypeId);
    
    public void deletePhoneTypeEntity(PhoneTypeEntity phoneType);
    
    public List<PhoneTypeEntity> getAllPhoneTypeEntitys();
    
    // Retrieve
    public PhoneTypeEntity getPhoneTypeEntity(long id);
    
    public List<PhoneTypeEntity> getPhoneTypeEntity(PhoneTypeEntity exampleEntity);
    */

}
