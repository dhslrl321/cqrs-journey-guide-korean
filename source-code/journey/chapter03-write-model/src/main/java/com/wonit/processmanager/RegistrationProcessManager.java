package com.wonit.processmanager;

import com.wonit.processmanager.event.OrderPlaced;

public class RegistrationProcessManager {

    Long orderId;
    Long reservationId;

    ProcessState state;

    public void handle(OrderPlaced message) {
        if (!state.equals(ProcessState.NOT_STARTED)) {
            throw new IllegalStateException();
        }

        orderId = message.getOrderId();
        reservationId = IdGenerator.gen();
        state = ProcessState.AWAITING_RESERVATION_CONFIRMATION;

        this.addCommand(new MakeSeatReservation(message.getConferenceId(), message.getReservationId()), message.getSeatCount());
    }

    private void addCommand(MakeSeatReservation makeSeatReservation, Object seatCount) {

    }

}
