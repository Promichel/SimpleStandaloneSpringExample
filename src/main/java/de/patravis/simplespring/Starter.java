package de.patravis.simplespring;

import de.patravis.simplespring.beans.UserService;
import de.patravis.simplespring.config.ApplicationConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Starter {

    private final transient Logger logger = LoggerFactory.getLogger(Starter.class);

    @Autowired
    private UserService userService;

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        Starter starter = ctx.getBean(Starter.class);

        starter.tellAboutUser();
    }

    public void tellAboutUser() {
        logger.debug("{} is the king in town.", userService.getUser().getName());
    }

}
