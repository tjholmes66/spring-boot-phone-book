package com.tomholmes.springboot.phonebook.server.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tomholmes.springboot.phonebook.server.domain.LinkTypeEntity;

@Repository("linkTypeDao")
public interface LinkTypeDao extends CrudRepository<LinkTypeEntity, Long>
{

    /*
    public LinkTypeEntity saveLinkTypeEntity(LinkTypeEntity linkType);
    
    public void deleteLinkTypeEntity(Long linkTypeId);
    
    public void deleteLinkTypeEntity(LinkTypeEntity linkType);
    
    public List<LinkTypeEntity> getAllLinkTypeEntitys();
    
    // Retrieve
    public LinkTypeEntity getLinkTypeEntity(long id);
    
    public List<LinkTypeEntity> getLinkTypeEntity(LinkTypeEntity exampleEntity);
    */

}