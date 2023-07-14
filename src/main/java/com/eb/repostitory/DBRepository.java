package com.eb.repostitory;

import com.eb.domain.Message;
import org.springframework.stereotype.Component;

@Component("dbRepository")
public class DBRepository implements Repository
{
    @Override
    public void save(Message message)
    {
        System.out.println("Your message is being saved to the local file.");
    }
}
