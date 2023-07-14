package com.eb.service;

import com.eb.domain.Message;
import com.eb.repostitory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MailService
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

    public void sendMessage(Message message)
    {
        System.out.println("this is the mail service. you got a new message: " + message.getMessage());
    }
}
