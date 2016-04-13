package com.app.web;

import java.util.Map;

import javax.validation.Valid;

import org.app.pojo.User;
import org.app.pojo.UserValidator;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

	/*@InitBinder  
    public void initBinder(DataBinder binder) {  
       binder.setValidator(new UserValidator());  
    }  
   */
    @RequestMapping(value="login",method={RequestMethod.GET})  
    public String relogin(Map<String, Object> model) {  
    	User user = new User();
        model.put("user", user);
       return "user/login";  
    }
    
    @RequestMapping(value="login",method={RequestMethod.POST})  
    public String login(@Valid @ModelAttribute("user") User user, BindingResult result) {  
       if (result.hasErrors())
           return "user/login";  
       return "user/success";
    }
}
