package com.eb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import java.util.Properties;
import java.util.Random;

@Configuration
@ComponentScan //default com.eb
@PropertySource("classpath:application.properties")
public class AppConfiguration
{
    /*
        @Component:    Class level
        @Bean:         Bean level
     */

    @Autowired
    private Environment environment;

    @Bean
    public Random random()
    {
        return new Random();
    }

    @Bean
    public Properties properties()
    {
        Properties properties = new Properties();
        properties.put("email", environment.getProperty("app.email"));
        properties.put("phone", environment.getProperty("app.phone"));
        return properties;
    }
}
