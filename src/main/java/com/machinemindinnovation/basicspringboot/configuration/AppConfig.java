package com.machinemindinnovation.basicspringboot.configuration;

import com.machinemindinnovation.basicspringboot.DB;
import com.machinemindinnovation.basicspringboot.DevDB;
import com.machinemindinnovation.basicspringboot.ProdDB;
import org.modelmapper.ModelMapper;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    @ConditionalOnProperty(name="project.mode", havingValue="development")
    public DB getDevBean(){
        return new DevDB();
    }

    @Bean
    @ConditionalOnProperty(name="project.mode", havingValue="production")
    public DB getProdBean(){
        return new ProdDB();
    }

    @Bean
    public ModelMapper getModelMapper(){
        return new ModelMapper();
    }


}
