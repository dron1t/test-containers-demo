package com.kainos.test2.bookingservice.handlers;

import com.kainos.test2.bookingservice.models.BookingResponse;
import com.kainos.test2.bookingservice.repositories.BookingRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@AllArgsConstructor
@Component
public class BookingQuery implements Query<Flux<BookingResponse>> {

    private final BookingRepository repository;

    @Override
    public Flux<BookingResponse> get() {
        return repository.findAll().map(event -> new BookingResponse(event.getId(), event.getDestination(), event.getName(), event.getCreationDate()));
    }
}
