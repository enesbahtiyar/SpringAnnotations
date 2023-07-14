package com.eb.app;

import com.eb.AppConfiguration;
import com.eb.domain.Message;
import com.eb.repostitory.DBRepository;
import com.eb.repostitory.FileRepository;
import com.eb.repostitory.Repository;
import com.eb.service.MailService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApplication
{
    public static void main(String[] args)
    {
        Message message = new Message();
        message.setMessage("Your package arrived");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

        MailService mailService = context.getBean(MailService.class);
        MailService mailService1 = context.getBean(MailService.class);

        mailService.sendMessage(message);

        if(mailService == mailService1)
        {
            System.out.println("same");
        }
        else
        {
            System.out.println("different");
        }

        context.close(); //destroy the beans that stored inside the beans
    }
}
