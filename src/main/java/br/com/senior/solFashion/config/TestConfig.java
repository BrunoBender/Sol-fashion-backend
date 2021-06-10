package br.com.senior.solFashion.config;

import br.com.senior.solFashion.services.BdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.text.ParseException;

@Configuration
@Profile("test")
public class TestConfig {

    @Autowired
    private BdService bdService;

    @Bean
    public boolean instantiateDatabase() throws ParseException{
        bdService.instantiateTestDatabase();
        return true;
    }
}
