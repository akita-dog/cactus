package com.akita.cactus.auth.service;

import com.akita.cactus.auth.dto.LoginResp;
import org.springframework.security.core.userdetails.User;

public interface TokenService {
    LoginResp login(String username, String password);

    User validated(String token);
}
