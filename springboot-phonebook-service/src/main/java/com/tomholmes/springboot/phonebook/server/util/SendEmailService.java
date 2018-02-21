package com.tomholmes.springboot.phonebook.server.util;

public interface SendEmailService
{

    void sendMail(String from, String to, String subject, String msg);

}
