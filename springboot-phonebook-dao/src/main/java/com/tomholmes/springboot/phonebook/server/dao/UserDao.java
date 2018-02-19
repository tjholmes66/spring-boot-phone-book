package com.tomholmes.springboot.phonebook.server.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tomholmes.springboot.phonebook.server.domain.UserEntity;

@Repository("userDao")
public interface UserDao extends CrudRepository<UserEntity, Long>
{
    List<UserEntity> findUserByUsernameAndPassword(String username, String password);

    List<UserEntity> findUserByEmail(String email);

    List<UserEntity> findUserByUsername(String username);

}
