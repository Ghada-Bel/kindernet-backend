package com.example.kindernetbackend.service;

import com.example.kindernetbackend.entity.Event;
import java.util.List;

public interface EventService {
    List<Event> getAllEvents();
    Event saveEvent(Event event);
    void deleteEvent(Long id);
}
