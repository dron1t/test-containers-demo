package com.kainos.test2.bookingservice.handlers;

import com.kainos.test2.bookingservice.commands.AddBookingRequest;
import com.kainos.test2.bookingservice.events.AddBookingEvent;
import com.kainos.test2.bookingservice.repositories.BookingRepository;
import com.kainos.test2.bookingservice.responses.AddBookingResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@Component
public class AddBookingRequestHandler implements CommandHandler<AddBookingRequest, AddBookingResponse> {

    private final BookingRepository bookingRepository;

    @Override
    public Mono<AddBookingResponse> handle(AddBookingRequest command) {
        return bookingRepository
                .save(AddBookingEvent.builder()
                        .name(command.name())
                        .destination(command.destination())
                .build())
                .map(addBookingEvent -> new AddBookingResponse(addBookingEvent.getId()));
    }

    @Override
    public Class<AddBookingRequest> commandType() {
        return AddBookingRequest.class;
    }
}
