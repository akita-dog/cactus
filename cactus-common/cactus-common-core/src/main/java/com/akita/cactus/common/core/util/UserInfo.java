package com.akita.cactus.common.core.util;

import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserInfo {
    private Long id;
    private String username;
    private String password;
    private Boolean enable;
    private List<String> roles;
}
