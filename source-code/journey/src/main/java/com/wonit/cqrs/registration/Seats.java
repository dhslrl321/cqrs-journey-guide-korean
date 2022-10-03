package com.wonit.cqrs.registration;

import java.util.List;
import lombok.Value;

@Value(staticConstructor = "of")
public class Seats {
    List<Seat> seats;

    public List<Seat> get() {
        return seats;
    }
}
