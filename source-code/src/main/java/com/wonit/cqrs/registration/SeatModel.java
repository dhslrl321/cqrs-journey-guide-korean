package com.wonit.cqrs.registration;

import lombok.Value;

@Value(staticConstructor = "of")
public class SeatModel {
    Long seatTypeId;
    Integer quantity;
}
