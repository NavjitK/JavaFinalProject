package com.eventhub.userconnection.service;

import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eventhub.userconnection.dao.UserDAO;
import com.eventhub.userconnection.model.User;

@Service
@Transactional
public class UserServiceImplementation implements UserService {
	@Autowired
	UserDAO userDAO;
	@Transactional
	@Override
	public List<User> get() {
		// TODO Auto-generated method stub
		return userDAO.get();
	}

	@Override
	public User get(int userid) {
		// TODO Auto-generated method stub
		return userDAO.get(userid);
	}

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		userDAO.save(user);
	}

	@Override
	public JSONObject getEve(int userid) throws ParseException {
		// TODO Auto-generated method stub
		return userDAO.getEve(userid);
	}

}
