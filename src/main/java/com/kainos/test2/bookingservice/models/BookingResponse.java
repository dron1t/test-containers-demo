package com.kainos.test2.bookingservice.models;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

public record BookingResponse (
        long id,
        String destination,
        String name,
        LocalDateTime creationDate
){};
