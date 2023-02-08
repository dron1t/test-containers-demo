package com.kainos.test2.bookingservice.repositories;

import com.kainos.test2.bookingservice.events.AddBookingEvent;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface BookingRepository extends ReactiveCrudRepository<AddBookingEvent, Long> {
}
