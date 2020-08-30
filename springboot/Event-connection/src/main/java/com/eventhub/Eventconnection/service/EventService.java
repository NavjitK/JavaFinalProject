package com.eventhub.Eventconnection.service;

import java.util.List;

import com.eventhub.Eventconnection.model.Event;

public interface EventService {
	List<Event> get();

    Event get(int id);

    void save(Event event);

    
}
