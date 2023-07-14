package com.eb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

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
    @Bean
    public Random random()
    {
        return new Random();
    }
}
