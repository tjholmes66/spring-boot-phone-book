package com.tomholmes.springboot.phonebook.server.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tomholmes.springboot.phonebook.server.domain.EmailTypeEntity;

@Repository("emailTypeDao")
public interface EmailTypeDao extends JpaRepository<EmailTypeEntity, Long>
{

}
