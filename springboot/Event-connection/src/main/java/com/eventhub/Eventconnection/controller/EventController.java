package com.eventhub.Eventconnection.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eventhub.Eventconnection.model.Event;
import com.eventhub.Eventconnection.service.EventService;

@RestController
@RequestMapping("/api")
public class EventController {
	@Autowired
	EventService eventService;
	
	@RequestMapping("/event")
    public List<Event> get(){
        return eventService.get();
    }
	
	@RequestMapping(method = RequestMethod.POST,value = "/event")
    public String save(@RequestBody Event event)
    {
        eventService.save(event);
        return "Data Added to the Database Successfully";
    }
	
	@RequestMapping("/event/{id}")
    public Event get(@PathVariable int id)
    {
        Event userObject = eventService.get(id);
        if(userObject == null){
            throw new RuntimeException("Event with the name "+id+" does not exist");
        }
        else{
            return userObject;
        }
    }

}
