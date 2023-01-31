package com.kainos.test2.bookingservice.controllers;

import com.kainos.test2.bookingservice.commands.AddBookingRequest;
import com.kainos.test2.bookingservice.handlers.BookingHandlerFactory;
import com.kainos.test2.bookingservice.responses.AddBookingResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    private final BookingHandlerFactory factory;

    public BookingController(BookingHandlerFactory factory) {
        this.factory = factory;
    }

    @PostMapping()
    public Mono<AddBookingResponse> addBookingRequest(@RequestBody AddBookingRequest requestBody) {
        return factory.getCommandHandler(requestBody).map(handler -> handler.handle(requestBody)).orElseThrow();

    }
}
