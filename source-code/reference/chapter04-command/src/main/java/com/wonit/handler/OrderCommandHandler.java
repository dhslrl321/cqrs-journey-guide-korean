package com.wonit.handler;

import com.wonit.command.AssignRegistrantDetails;
import com.wonit.command.ConfirmOrder;
import com.wonit.command.MakeReservation;
import com.wonit.command.MarkSeatsAsReserved;
import com.wonit.command.RegisterToConference;
import com.wonit.command.RejectOrder;
import com.wonit.domain.EventSourcedRepository;
import com.wonit.domain.Order;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrderCommandHandler {
    private final EventSourcedRepository<Order> repository;

    CommandHandler<RegisterToConference> makeReservationCommandHandler = command -> {
        // .. impl
    };
    CommandHandler<MarkSeatsAsReserved> markSeatsAsReservedCommandHandler = command -> {
        // .. impl
    };
    CommandHandler<RejectOrder> rejectOrderCommandHandler = command -> {
        // .. impl
    };
    CommandHandler<AssignRegistrantDetails> assignRegistrantDetailsCommandHandler = command -> {
        // .. impl
    };
    CommandHandler<ConfirmOrder> confirmOrderCommandHandler = command -> {
        // .. impl
    };
}
