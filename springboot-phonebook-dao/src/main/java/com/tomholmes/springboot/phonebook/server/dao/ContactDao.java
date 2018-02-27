package com.tomholmes.springboot.phonebook.server.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tomholmes.springboot.phonebook.server.domain.ContactEntity;
import com.tomholmes.springboot.phonebook.server.domain.UserEntity;

@Repository("contactDao")
public interface ContactDao extends JpaRepository<ContactEntity, Long>
{

    List<ContactEntity> findByUser(UserEntity user);

}
