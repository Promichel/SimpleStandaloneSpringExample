package de.patravis.simplespring.config;

import de.patravis.simplespring.Starter;
import de.patravis.simplespring.beans.User;
import de.patravis.simplespring.beans.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public Starter starter() {
        return new Starter();
    }

    @Bean
    public UserService userService() {
        return new UserService();
    }

    @Bean
    @Scope("prototype")
    public User user() {
        User user = new User();
        user.setName("Patrick");

        return user;
    }

}
