package com.aib.configuration;

import com.aib.domain.businessLogic.MockCarLogic;
import com.aib.persistence.repository.MockCarRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanManagement {

    /** Mocking ********/
    @Bean
    public MockCarRepository carRepository(){
        return new MockCarRepository();
    }

    @Bean
    public MockCarLogic carLogic(){
        return new MockCarLogic(carRepository());
    }
    /** Mocking ********/
}
