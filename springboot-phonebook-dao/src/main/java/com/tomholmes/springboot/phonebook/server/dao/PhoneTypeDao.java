package com.tomholmes.springboot.phonebook.server.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tomholmes.springboot.phonebook.server.domain.PhoneTypeEntity;

@Repository("phoneTypeDao")
public interface PhoneTypeDao extends JpaRepository<PhoneTypeEntity, Long>
{

}
