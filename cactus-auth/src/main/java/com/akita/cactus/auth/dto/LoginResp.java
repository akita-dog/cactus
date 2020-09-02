package com.akita.cactus.auth.dto;

import lombok.Builder;
import lombok.Data;
import org.springframework.security.core.userdetails.UserDetails;

@Data
@Builder
public class LoginResp {
    private String token;

    private String tokenPrefix;

    private UserDetails user;
}
