package com.wonit;

import com.wonit.common.AggregateRoot;
import com.wonit.common.Event;
import com.wonit.common.EventPublisher;
import java.util.ArrayList;
import java.util.List;

public class Order implements AggregateRoot, EventPublisher {
    private List<Event> events = new ArrayList<>();

    private final Long id;
    private final Long userId;
    private final Long conferenceId;
    private final List<TicketOrderLine> lines = new ArrayList<>();
    private OrderState state = OrderState.CREATED;

    public Order(Long id, Long userId, Long conferenceId) {
        this.id = id;
        this.userId = userId;
        this.conferenceId = conferenceId;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void markAsBooked() {
        if (this.state != OrderState.CREATED) {
            throw new IllegalStateException();
        }
        this.state = OrderState.BOOKED;
    }

    public void reject() {
        if (this.state != OrderState.CREATED) {
            throw new IllegalStateException();
        }
        this.state = OrderState.REJECTED;
    }
}
