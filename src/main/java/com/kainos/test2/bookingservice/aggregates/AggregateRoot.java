package com.kainos.test2.bookingservice.aggregates;

import com.kainos.test2.bookingservice.events.Event;

import java.util.List;

public abstract class AggregateRoot<T>{

    private int version;
    private List<Event> events;

    protected AggregateRoot() {
        this.version = 1;
    }

    protected void incrementVersion() {
        this.version += 1;
    }
}
