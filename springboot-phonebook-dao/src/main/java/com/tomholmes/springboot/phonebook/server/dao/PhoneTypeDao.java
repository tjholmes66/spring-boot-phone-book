package com.tomholmes.springboot.phonebook.server.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tomholmes.springboot.phonebook.server.domain.PhoneTypeEntity;

@Repository("phoneTypeDao")
public interface PhoneTypeDao extends CrudRepository<PhoneTypeEntity, Long>
{

}
