package com.wonit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Order extends AbstractEventSourced {

    private List<SeatQuantity> seats;

    private final Map<Type, Action<VersionedEvent>> handlers = new HashMap<>();
    private final List<VersionedEvent> pendingEvents = new ArrayList<>();

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
