package com.festu.auth.api.auth.action;

import com.festu.auth.model.User;
import com.festu.auth.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * Created on 3/26/2022
 *
 * @author Fedor Ishchenko
 */
@Component
@RequiredArgsConstructor
public class LoginAction {

    private final UserService service;

    public User execute(String username, String password) {
        User user = (User) service.loadUserByUsername(username);
        if (user.getPassword().equals(password)) return user;
        return null;
    }

}
