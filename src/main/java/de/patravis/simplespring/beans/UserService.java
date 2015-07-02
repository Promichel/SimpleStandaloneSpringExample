package de.patravis.simplespring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private User user;

    public User getUser() {
        return user;
    }

}
