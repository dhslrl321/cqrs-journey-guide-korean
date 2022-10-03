package com.wonit.cqrs.registration;

import lombok.Value;

@Value(staticConstructor = "of")
public class Seat {
    Long seatTypeId;
    Integer quantity;
}
