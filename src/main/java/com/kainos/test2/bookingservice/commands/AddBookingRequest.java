package com.kainos.test2.bookingservice.commands;

public record AddBookingRequest (String name, String destination) implements Command{
}
