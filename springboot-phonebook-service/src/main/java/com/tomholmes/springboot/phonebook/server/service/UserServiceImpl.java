package com.tomholmes.springboot.phonebook.server.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tomholmes.springboot.phonebook.server.dao.UserDao;
import com.tomholmes.springboot.phonebook.server.domain.UserEntity;

@Transactional
@Service("userService")
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserDao userDao;

    @Override
    public List<UserEntity> getAllUsers()
    {
        List<UserEntity> userList = (List<UserEntity>) userDao.findAll();
        return userList;
    }

    @Override
    public UserEntity getUserById(long userId)
    {
        UserEntity userEntity = userDao.getOne(userId);
        return userEntity;
    }

    @Override
    public UserEntity add(UserEntity newUser)
    {
        UserEntity userEntity = userDao.save(newUser);
        return userEntity;
    }

    @Override
    public void remove(UserEntity userEntity)
    {
        userDao.deleteById(userEntity.getUserId());
    }

    @Override
    public void remove(long userId)
    {
        userDao.deleteById(userId);
    }

    @Override
    public UserEntity update(UserEntity newUser)
    {
        UserEntity updatedUserEntity = userDao.save(newUser);
        return updatedUserEntity;
    }
}
