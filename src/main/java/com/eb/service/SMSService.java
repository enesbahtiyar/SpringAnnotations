package com.eb.service;

import com.eb.domain.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Component("smsService")
public class SMSService implements MessageService
{
    @Autowired
    private Properties properties;

    @Override
    public void sendMessage(Message message)
    {
        System.out.println("This is the sms service. you have a new message: " + message.getMessage() + "||" + properties.get("phone"));
    }
}
