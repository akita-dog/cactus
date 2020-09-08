package com.akita.cactus.workbench.rest.api;

import com.akita.cactus.common.core.util.UserInfo;
import com.akita.cactus.common.core.util.UserInfoHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController{

    @GetMapping("/currentUser")
    public UserInfo currentUser() {
        return UserInfoHolder.getCurrentUser();
    }

}
