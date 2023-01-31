package com.kainos.test2.bookingservice.handlers;

import com.kainos.test2.bookingservice.commands.Command;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class BookingHandlerFactory {

    private final Map<Class<Command>, CommandHandler> commandHandlers;

    public BookingHandlerFactory(List<CommandHandler> commandHandlers) {
        this.commandHandlers = commandHandlers.stream().collect(Collectors.toMap(f -> f.commandType(), f -> f));
    }

    public Optional<CommandHandler> getCommandHandler(Command command) {
        return Optional.ofNullable(this.commandHandlers.get(command.getClass()));
    }

}
