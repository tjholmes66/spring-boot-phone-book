package com.tomholmes.springboot.phonebook.server.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tomholmes.springboot.phonebook.server.domain.ContactEmailEntity;
import com.tomholmes.springboot.phonebook.server.domain.ContactEntity;

@Repository("contactEmailDao")
public interface ContactEmailDao extends CrudRepository<ContactEmailEntity, Long>
{

    List<ContactEmailEntity> findByContact(ContactEntity contact);

}
