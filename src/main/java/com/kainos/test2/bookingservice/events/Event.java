package com.kainos.test2.bookingservice.events;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Getter
@Setter
public abstract class Event<T> {

    @Id
    private int id;

    private LocalDateTime creationDate;
}
