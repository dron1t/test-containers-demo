package com.kainos.test2.bookingservice.handlers;

import reactor.core.publisher.Mono;

public interface CommandHandler<T, R> {

    Mono<R> handle(T command);

    Class<T> commandType();
}
