package com.kainos.test2.bookingservice.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class AddBookingEvent extends Event<AddBookingEvent> {

    private String destination;
    private String name;

    public AddBookingEvent() {
    }
}
