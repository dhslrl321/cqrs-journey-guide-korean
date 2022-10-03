package com.wonit.cqrs.registration;

import lombok.Value;

@Value(staticConstructor = "of")
public class RegisterToConference {
    Long orderId;
    Long conferenceId;
    Seats seats;
}
