package com.tomholmes.springboot.phonebook.server.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tomholmes.springboot.phonebook.server.domain.ContactEmailEntity;
import com.tomholmes.springboot.phonebook.server.domain.ContactEntity;

@Repository("contactEmailDao")
public interface ContactEmailDao extends JpaRepository<ContactEmailEntity, Long>
{

    List<ContactEmailEntity> findByContact(ContactEntity contact);

}
