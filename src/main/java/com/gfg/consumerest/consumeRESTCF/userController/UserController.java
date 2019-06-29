package com.gfg.consumerest.consumeRESTCF.userController;

import com.gfg.consumerest.consumeRESTCF.Service.UserService;
import com.gfg.consumerest.consumeRESTCF.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/codeforces/{handle}")
    public Map<String, Object> getUserInfo(@PathVariable String handle){
        return userService.getDetail(handle);
    }

}
