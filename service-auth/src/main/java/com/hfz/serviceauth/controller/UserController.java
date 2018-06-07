package com.hfz.serviceauth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @author youjin
 * @Description:
 * @date 2018-06-07-14:03
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @RequestMapping(value = "/current", method = RequestMethod.GET)
    public Principal getUser(Principal principal){
        return principal;
    }
}
