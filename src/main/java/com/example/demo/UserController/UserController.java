package com.example.demo.UserController;

import com.example.demo.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    UserService userService;
    @RequestMapping(value = "/login",method = {RequestMethod.GET,RequestMethod.POST})
    public String index(){
        return "login";
    }
    @RequestMapping(value = "/loginpage",method = {RequestMethod.GET,RequestMethod.POST})
    public String login(HttpServletRequest request, HttpSession session){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String subject = userService.login(username,password);
        session.setAttribute("subject",subject);
        if(subject == null){
            return "login";
        }
        else{

            return "index";
        }
    }

}
