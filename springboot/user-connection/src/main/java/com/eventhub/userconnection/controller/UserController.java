package com.eventhub.userconnection.controller;

import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eventhub.userconnection.model.User;
import com.eventhub.userconnection.service.UserService;
import com.eventhub.userconnection.service.UserServiceImplementation;



@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
    UserService userService;

    @RequestMapping("/user")
    public List<User> get(){
        return userService.get();
    }
    
    @RequestMapping(method = RequestMethod.POST,value = "/user")
    public String save(@RequestBody User user)
    {
        userService.save(user);
        return "Data Added to the Database Successfully";
    }
    
    @RequestMapping("/user/{userid}")
    public User get(@PathVariable int userid)
    {
        User userObject = userService.get(userid);
        if(userObject == null){
            throw new RuntimeException("User with the id"+userid+" does not exist");
        }
        else{
            return userObject;
        }
    }
    @RequestMapping("/eve/{userid}")
    public JSONObject getev(@PathVariable int userid) throws ParseException {
    	JSONObject obj = userService.getEve(userid);
    	if(obj==null) {
    		throw new RuntimeException("User with the id"+userid+"does not exist");
    	}
    	else {
    		return obj;
    	}
    	
    	
    }

}
