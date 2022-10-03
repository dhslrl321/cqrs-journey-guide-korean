package com.wonit.command;

import java.util.UUID;
import lombok.Value;

@Value
public class MakeReservation implements Command {

    String id;
    String conferenceId;
    String reservationId;
    int numberOfSeats;

    public MakeReservation(String conferenceId, String reservationId, int numberOfSeats) {
        this.id = UUID.randomUUID().toString();
        this.conferenceId = conferenceId;
        this.reservationId = reservationId;
        this.numberOfSeats = numberOfSeats;
    }
}
