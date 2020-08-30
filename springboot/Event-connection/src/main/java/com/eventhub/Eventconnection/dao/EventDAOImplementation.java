package com.eventhub.Eventconnection.dao;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eventhub.Eventconnection.model.Event;
@Repository
public class EventDAOImplementation implements EventDAO {
	@Autowired
	EntityManager entityManager;

	@Override
	public List<Event> get() {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
        Query<Event> query = currentSession.createQuery("from Event",Event.class);
        List<Event> list= query.getResultList();
        
        return list;
	}

	@Override
	public Event get(int id) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap((Session.class));
        Event event = currentSession.get(Event.class,id);
        return event;
	}

	@Override
	public void save(Event event) {
		// TODO Auto-generated method stub
		Session currentSession=entityManager.unwrap((Session.class));
        currentSession.save(event);
		
	}

}
