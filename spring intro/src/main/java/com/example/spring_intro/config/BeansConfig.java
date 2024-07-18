package com.example.spring_intro.config;

import com.example.spring_intro.primary.CustomerAServiceImpl;
import com.example.spring_intro.primary.CustomerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:beans.xml")
public class BeansConfig {

    /*  Esta clase se utiliza para configurar clases de workframes externos
     */


 //   @Bean
    public CustomerService customerService(){
        return new CustomerAServiceImpl();
    }

}
