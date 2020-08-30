package com.eventhub.userconnection.service;

import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import com.eventhub.userconnection.model.User;

public interface UserService {
	
	List<User> get();

    User get(int userid);

    void save(User user);
 
    JSONObject getEve(int userid) throws ParseException;

}
