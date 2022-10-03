package com.wonit;

import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

public class Order extends AbstractEventSourced {

    private List<SeatQuantity> seats;

    public Order(String id, int version) {
        super(id, version);
    }

    public void updateSeats(List<OrderItem> seats) {
        super.update(new OrderUpdated(convertItems(seats)));
    }

    private Object convertItems(List<OrderItem> seats) {
        return null;
    }
}
