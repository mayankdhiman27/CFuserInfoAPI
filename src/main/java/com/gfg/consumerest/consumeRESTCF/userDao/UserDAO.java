package com.gfg.consumerest.consumeRESTCF.userDao;


import com.gfg.consumerest.consumeRESTCF.user.Result;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Component
public class UserDAO{

    public Map<String, Object> restTemplate(String handle){
        RestTemplate restTemplate = new RestTemplate();
        Result user = restTemplate.getForObject("https://codeforces.com/api/user.info?handles=" + handle + ";", Result.class);

        return user.getAdditionalProperties();
    }

}
