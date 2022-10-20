package com.wonit.event;

import com.wonit.domain.SeatQuantity;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

public class AvailableSeatsChanged extends AbstractVersionedEvent {
    @Getter @Setter
    List<SeatQuantity> seats;
}
