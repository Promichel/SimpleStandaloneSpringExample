package de.patravis.simplespring;

import de.patravis.simplespring.beans.UserService;
import de.patravis.simplespring.config.ApplicationConfiguration;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationConfiguration.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void kingsTest() {
        Assert.assertTrue(userService.getUser().getName().equals("Patrick"));
    }

}
