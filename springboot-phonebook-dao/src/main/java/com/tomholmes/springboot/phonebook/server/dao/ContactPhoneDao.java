package com.tomholmes.springboot.phonebook.server.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tomholmes.springboot.phonebook.server.domain.ContactEntity;
import com.tomholmes.springboot.phonebook.server.domain.ContactPhoneEntity;

@Repository("contactPhoneDao")
public interface ContactPhoneDao extends JpaRepository<ContactPhoneEntity, Long>
{

    List<ContactPhoneEntity> findByContact(ContactEntity contact);

}
