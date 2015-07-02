package de.patravis.simplespring.config;

import de.patravis.simplespring.Starter;
import de.patravis.simplespring.beans.User;
import de.patravis.simplespring.beans.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:test.properties")
public class ApplicationConfiguration {

    @Value("${king.name}")
    private String kingsName;

    /**
     * This method is important if you are using @Value annotated fields with property files in Spring Configuration classes.
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

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
        user.setName(kingsName);

        return user;
    }

}
