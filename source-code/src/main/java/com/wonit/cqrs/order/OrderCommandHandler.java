package com.wonit.cqrs.order;

import com.wonit.cqrs.registration.RegisterToConference;
import com.wonit.cqrs.registration.Seats;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrderCommandHandler {

    private final OrderRepository repository;

    public void handle(RegisterToConference command) {
        List<OrderItem> orderItems = command.getSeats().get()
                .stream()
                .map(s -> OrderItem.of(s.getSeatTypeId(), s.getQuantity()))
                .collect(Collectors.toList());

        Order order = Order.create(command.getOrderId(), command.getConferenceId(), orderItems);
        repository.save(order);
    }
}
