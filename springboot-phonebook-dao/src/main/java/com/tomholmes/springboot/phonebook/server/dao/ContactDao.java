package com.tomholmes.springboot.phonebook.server.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tomholmes.springboot.phonebook.server.domain.ContactEntity;
import com.tomholmes.springboot.phonebook.server.domain.UserEntity;

@Repository("contactDao")
public interface ContactDao extends CrudRepository<ContactEntity, Long>
{

    List<ContactEntity> findByUser(UserEntity user);

}
