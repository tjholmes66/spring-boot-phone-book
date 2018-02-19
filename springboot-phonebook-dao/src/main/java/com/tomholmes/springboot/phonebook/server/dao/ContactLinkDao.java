package com.tomholmes.springboot.phonebook.server.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tomholmes.springboot.phonebook.server.domain.ContactEntity;
import com.tomholmes.springboot.phonebook.server.domain.ContactLinkEntity;

@Repository("contactLinkDao")
public interface ContactLinkDao extends CrudRepository<ContactLinkEntity, Long>
{

    List<ContactLinkEntity> findByContact(ContactEntity contact);

}
