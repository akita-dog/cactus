package com.akita.cactus.common.core.util;

import lombok.Data;

import java.util.List;

@Data
public class UserInfo {
    private Long id;
    private String username;
    private String password;
    private Boolean enable;
    private List<String> roles;
}
