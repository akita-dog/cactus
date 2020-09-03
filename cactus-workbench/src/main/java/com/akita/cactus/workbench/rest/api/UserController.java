package com.akita.cactus.workbench.rest.api;

import com.akita.cactus.workbench.dto.UserDTO;
import com.akita.cactus.workbench.holder.UserHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController{

    @Autowired
    private UserHolder userHolder;

    @GetMapping("/currentUser")
    public UserDTO currentUser() {
        return userHolder.getCurrentUser();
    }

}
