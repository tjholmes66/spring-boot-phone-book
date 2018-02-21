package com.tomholmes.springboot.phonebook.server.service;

import com.tomholmes.springboot.phonebook.server.domain.UserEntity;

public interface LoginService
{
    UserEntity login(String username, String password);

    UserEntity loginByEmail(String email);

    UserEntity loginByUsername(String username);
}
