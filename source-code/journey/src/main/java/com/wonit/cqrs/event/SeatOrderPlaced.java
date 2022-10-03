package com.wonit.cqrs.event;

import lombok.Value;

@Value(staticConstructor = "of")
public class SeatOrderPlaced {
    Long seatTypeId;
    Integer quantity;
}
