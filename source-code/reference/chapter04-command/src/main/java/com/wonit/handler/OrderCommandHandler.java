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
    CommandHandler<RegisterToConference> makeReservationCommandHandler;
    CommandHandler<MarkSeatsAsReserved> markSeatsAsReservedCommandHandler;
    CommandHandler<RejectOrder> rejectOrderCommandHandler;
    CommandHandler<AssignRegistrantDetails> assignRegistrantDetailsCommandHandler;
    CommandHandler<ConfirmOrder> confirmOrderCommandHandler;

    private final EventSourcedRepository<Order> repository;

}
