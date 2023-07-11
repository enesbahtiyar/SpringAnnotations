package com.eb.service;

import com.eb.domain.Message;
import org.springframework.stereotype.Component;

@Component
public class MailService
{
    public void sendMessage(Message message)
    {
        System.out.println("this is the mail service. you got a new message: " + message.getMessage());
    }
}
