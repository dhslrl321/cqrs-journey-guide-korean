package com.wonit;

import java.util.List;

public class Order extends AbstractEventSourced {

    private List<SeatQuantity> seats;

    protected Order(String id) {
        super(id);
        super.handles(null);
    }

    public Order(String id, List<VersionedEvent> history) {
        super(id);
        super.loadFrom(history);
    }

    public void updateSeats(List<OrderItem> seats) {
        super.update(new OrderUpdatedEvent(convert(seats)));
    }

    private Object convert(List<OrderItem> seats) {
        return null;
    }
}
