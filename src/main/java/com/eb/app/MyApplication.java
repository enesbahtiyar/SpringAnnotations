package com.eb.app;

import com.eb.AppConfiguration;
import com.eb.domain.Message;
import com.eb.service.MailService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApplication
{
    public static void main(String[] args)
    {
        Message message = new Message();
        message.setMessage("Your package arriced");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

        MailService mailService = context.getBean(MailService.class);

        mailService.sendMessage(message);

        context.close(); //destroy the beans that stored inside the beans
    }
}
