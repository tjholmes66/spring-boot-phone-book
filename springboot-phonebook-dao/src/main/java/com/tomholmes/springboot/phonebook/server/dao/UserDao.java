package com.tomholmes.springboot.phonebook.server.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tomholmes.springboot.phonebook.server.domain.UserEntity;

@Repository("userDao")
public interface UserDao extends CrudRepository<UserEntity, Long>
{
    /*
    public UserEntity createUserEntity(UserEntity userEntity);
    
    public UserEntity updateUserEntity(UserEntity userEntity);
    
    public void deleteUserEntity(long userId);
    
    public void deleteUserEntity(UserEntity user);
    
    public List<UserEntity> getAllUserEntitys();
    
    // Retrieve
    public UserEntity getUserEntity(long id);
    
    public List<UserEntity> getUsersEntity(UserEntity exampleEntity);
    
    public List<UserEntity> getUserEntityByLogin(String username, String password);
    
    List<UserEntity> getUserEntityByEmail(String email);
    
    List<UserEntity> getUserEntityByUsername(String username);
    */

}
