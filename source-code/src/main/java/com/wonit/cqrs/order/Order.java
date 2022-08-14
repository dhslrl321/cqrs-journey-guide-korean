package com.wonit.cqrs.order;

import com.wonit.cqrs.registration.Seat;
import java.util.List;
import lombok.Value;

@Value(staticConstructor = "create")
public class Order {
    Long orderId;
    Long conferenceId;
    List<OrderItem> orderItems;
}
