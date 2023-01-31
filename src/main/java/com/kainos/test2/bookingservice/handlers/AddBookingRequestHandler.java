package com.kainos.test2.bookingservice.handlers;

import com.kainos.test2.bookingservice.commands.AddBookingRequest;
import com.kainos.test2.bookingservice.responses.AddBookingResponse;
import reactor.core.publisher.Mono;

public class AddBookingRequestHandler implements CommandHandler<AddBookingRequest, AddBookingResponse> {

    @Override
    public Mono<AddBookingResponse> handle(AddBookingRequest command) {
        return Mono.just(new AddBookingResponse(1));
    }

    @Override
    public Class<AddBookingRequest> commandType() {
        return AddBookingRequest.class;
    }


}
