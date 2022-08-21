package com.wonit.cqrs.order;

import static com.wonit.cqrs.order.OrderState.BOOKED;
import static com.wonit.cqrs.order.OrderState.CREATED;
import static com.wonit.cqrs.order.OrderState.REJECTED;

import com.wonit.cqrs.common.AbstractAggregateRoot;
import com.wonit.cqrs.common.EventPublisher;
import com.wonit.cqrs.event.Event;
import com.wonit.cqrs.event.OrderPlaced;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Getter;

@Getter
public class Order implements AbstractAggregateRoot, EventPublisher {

    private Long id;
    private Long conferenceId;
    private Long userId;
    private List<OrderItem> lines;
    private List<Event> events;
    // private List<TicketOrderLine> lines;
    private OrderState state;

    public Order(Long id, Long conferenceId, Long userId, List<OrderItem> lines) {
        this.id = id;
        this.userId = userId;
        this.conferenceId = conferenceId;
        this.lines = lines;

        lines.stream().map(item -> {
            new OrderPlaced()
            item.getSeatTypeId(), item.getQuantity()
        }).collect(Collectors.toList());

        OrderPlaced event = OrderPlaced.of(id, conferenceId, userId, );
        this.events.add(event);
    }

    public void markAsBooked() {
        if (!CREATED.equals(state)) {
            throw new IllegalStateException();
        }
        state = BOOKED;
    }

    public void reject() {
        if (!CREATED.equals(state)) {
            throw new IllegalStateException();
        }
        state = REJECTED;
    }
}
