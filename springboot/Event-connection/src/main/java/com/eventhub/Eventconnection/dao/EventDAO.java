package com.eventhub.Eventconnection.dao;

import java.util.List;

import com.eventhub.Eventconnection.model.Event;



public interface EventDAO {
	
	List<Event> get();

    Event get(int id);

    void save(Event event);

}
