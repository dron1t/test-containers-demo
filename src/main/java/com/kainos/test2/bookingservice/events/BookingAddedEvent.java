package com.kainos.test2.bookingservice.events;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class BookingAddedEvent extends Event<BookingAddedEvent> {

    private String destination;
    private String name;
}
