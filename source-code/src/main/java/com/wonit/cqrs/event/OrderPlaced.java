package com.wonit.cqrs.event;

import java.util.List;

public class OrderPlaced extends Event {
    public static OrderPlaced of(Long id, Long conferenceId, Long userId, List<SeatOrderPlaced> collect) {
        return new OrderPlaced();
    }
}
