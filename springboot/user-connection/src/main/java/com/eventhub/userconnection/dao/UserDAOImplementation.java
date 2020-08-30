package com.eventhub.userconnection.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eventhub.userconnection.model.User;

@Repository
public class UserDAOImplementation implements UserDAO{
	@Autowired
	EntityManager entityManager;

	@Override
	public List<User> get() {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
        Query<User> query = currentSession.createQuery("from User",User.class);
        List<User> list= query.getResultList();
        return list;
	}

	@Override
	public User get(int userid) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap((Session.class));
        User user = currentSession.get(User.class, userid);
        return user;
	}

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		Session currentSession=entityManager.unwrap((Session.class));
        currentSession.save(user);
	}

	@Override
	public JSONObject getEve(int userid) throws ParseException {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap((Session.class));
        User user = currentSession.get(User.class,userid);
        String str=user.getJdoc();
        Object obj = new JSONParser().parse(str);
        JSONObject jo = (JSONObject) obj;
        return jo;
		
	}

}
