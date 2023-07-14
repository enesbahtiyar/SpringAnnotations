package com.eb.service;

import com.eb.domain.Message;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component("mailService")
@Scope("prototype")   //singleton or prototype
public class MailService implements MessageService
{
    /*
    //Field Injection

    //@Autowired
    //@Qualifier("fileRepository")
    //private Repository repository;
     */

    /*
    //Setter Injection
    @Autowired
    @Qualifier("fileRepository")
    private Repository repository;
    public void setRepository(Repository repository)
    {
        this.repository = repository;
    }
     */

    /*
    //Constructor Injection
    private Repository repository;
    @Autowired //if you have only one constructor in a class you do not need to write @AutoWired
    public MailService(@Qualifier("fileRepository") Repository repository) {
        this.repository = repository;
    }

     */

    @Value("${app.email}")
    private String email;

    @Override
    public void sendMessage(Message message)
    {
        System.out.println("this is the mail service. you got a new message: " + message.getMessage());
    }
}
