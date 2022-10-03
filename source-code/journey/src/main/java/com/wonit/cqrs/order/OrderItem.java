package com.wonit.cqrs.order;

import lombok.Value;

@Value(staticConstructor = "of")
public class OrderItem {
    Long seatTypeId;
    Integer quantity;
}
