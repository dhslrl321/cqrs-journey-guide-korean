package com.wonit.cqrs.processmanager;

import static com.wonit.cqrs.processmanager.ProcessState.AWAITING_RESERVATION_CONFIRMATION;
import static com.wonit.cqrs.processmanager.ProcessState.NOT_STARTED;

import com.wonit.cqrs.event.OrderPlaced;
import com.wonit.cqrs.reservation.MakeSeatReservation;
import com.wonit.cqrs.util.IdGenerator;

public class RegistrationProcessManager {

    private Long reservationId;
    private Long orderId;
    private ProcessState state = NOT_STARTED;

    public void handle(OrderPlaced event) {
        if (!NOT_STARTED.equals(state)) {
            throw new IllegalStateException();
        }

        orderId = event.getOrderId();
        reservationId = IdGenerator.gen();
        state = AWAITING_RESERVATION_CONFIRMATION;

        Long conferenceId = event.getConferenceId();
        long numberOfSeats = event.getItems().stream().count();
        addCommand(new MakeSeatReservation(conferenceId, reservationId, numberOfSeats));
    }

    private void addCommand(MakeSeatReservation reservation) {

    }
}
