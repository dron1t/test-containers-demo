package com.kainos.test2.bookingservice.controllers;

import com.kainos.test2.bookingservice.commands.AddBookingRequest;
import com.kainos.test2.bookingservice.handlers.BookingHandlerFactory;
import com.kainos.test2.bookingservice.handlers.BookingQueryFactory;
import com.kainos.test2.bookingservice.models.BookingResponse;
import com.kainos.test2.bookingservice.responses.AddBookingResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@RestController
@RequestMapping("/bookings")
public class BookingController {

    private final BookingHandlerFactory handlerFactory;
    private final BookingQueryFactory queryFactory;

    @PostMapping()
    public Mono<AddBookingResponse> addBookingRequest(@RequestBody AddBookingRequest requestBody) {
        return handlerFactory.getCommandHandler(requestBody)
                .map(handler -> handler.handle(requestBody))
                .orElseThrow();

    }

    @GetMapping()
    public Flux<BookingResponse> getBookings() {
        return (Flux<BookingResponse>) queryFactory.getQuery().get();
    }
}
