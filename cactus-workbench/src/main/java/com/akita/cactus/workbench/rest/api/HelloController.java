package com.akita.cactus.workbench.rest.api;

import com.akita.cactus.common.core.api.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public R<String> hello() {
        return R.ok("hello world");
    }

}
