package com.kainos.test2.bookingservice.events;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public abstract class Event<T> {

    @Id
    private int id;

    private LocalDateTime creationDate;
}
