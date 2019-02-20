package com.itlaobing.web.controller;

import com.itlaobing.entity.User;
import com.itlaobing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user/**")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping( path = "/sign-up" , method = RequestMethod.GET)
    public String signUpPage(HttpServletRequest request) {


        return "sign-up" ;
    }

    @RequestMapping(path = "/sign-up",method = RequestMethod.POST)
    public String signUp(User user){

        int i = userService.save(user);
        //对结果判断，i>0去登陆，i<0去注册
        if (i>0){
            return "sign-in";
        }else{
            return "sign-up";
        }
    }

}
