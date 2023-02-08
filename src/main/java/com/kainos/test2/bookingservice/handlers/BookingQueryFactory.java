package com.kainos.test2.bookingservice.handlers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class BookingQueryFactory {

    private final BookingQuery query;

    public Query getQuery() {
        return query;
    }
}
