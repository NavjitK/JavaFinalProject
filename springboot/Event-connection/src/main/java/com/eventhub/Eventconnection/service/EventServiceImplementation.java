package com.eventhub.Eventconnection.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eventhub.Eventconnection.dao.EventDAO;
import com.eventhub.Eventconnection.model.Event;
@Service
@Transactional
public class EventServiceImplementation implements EventService{
	@Autowired
	EventDAO eventDAO;
	@Transactional
	@Override
	public List<Event> get() {
		// TODO Auto-generated method stub
		return eventDAO.get();
	}

	@Override
	public Event get(int id) {
		// TODO Auto-generated method stub
		return eventDAO.get(id);
	}

	@Override
	public void save(Event event) {
		// TODO Auto-generated method stub
		eventDAO.save(event);
		
	}

}
