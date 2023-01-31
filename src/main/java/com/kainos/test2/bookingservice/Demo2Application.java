package com.kainos.test2.bookingservice;

import com.kainos.test2.bookingservice.handlers.AddBookingRequestHandler;
import com.kainos.test2.bookingservice.handlers.BookingHandlerFactory;
import com.kainos.test2.bookingservice.handlers.CommandHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Demo2Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo2Application.class, args);
    }

    @Bean
    public BookingHandlerFactory getBookingHandlerFactory(List<CommandHandler> commandHandlers) {
        return new BookingHandlerFactory(commandHandlers);
    }

    @Bean
    public List<CommandHandler> getCommandHandlers() {
        return List.of(addBookingRequestHandler());
    }

    private AddBookingRequestHandler addBookingRequestHandler() {
        return new AddBookingRequestHandler();
    }
}
