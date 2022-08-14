package com.wonit.cqrs.registration;

import com.wonit.cqrs.order.OrderState;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RegistrationController {
    private final CommandBus commandBus;

    @PostMapping("/apis/registrations")
    public ResponseEntity<Boolean> startRegistration1(@RequestBody RegisterModel model) {
        RegisterToConference command = RegisterToConference.of(
                model.getOrderId(),
                model.getConferenceId(),
                Seats.of(model.items
                        .stream()
                        .map(x -> Seat.of(x.getSeatTypeId(), x.getQuantity()))
                        .collect(Collectors.toList())));

        commandBus.send(command);
        return ResponseEntity.ok(Boolean.TRUE);
    }

    @PostMapping("/apis/registrations")
    public ResponseEntity<Boolean> startRegistration2(@RequestBody RegisterModel model) {
        RegisterToConference command = RegisterToConference.of(
                model.getOrderId(),
                model.getConferenceId(),
                Seats.of(model.items
                        .stream()
                        .map(x -> Seat.of(x.getSeatTypeId(), x.getQuantity()))
                        .collect(Collectors.toList())));

        commandBus.send(command);

        // added!!
        OrderState draftOrder = this.waitUntilUpdated(model.getOrderId());

        if (OrderState.BOOKED.equals(draftOrder)) {
            return ResponseEntity.ok(Boolean.TRUE);
        } else if (OrderState.REJECTED.equals(draftOrder)) {
            return ResponseEntity.ok(Boolean.FALSE);
        }

        return ResponseEntity.ok(Boolean.FALSE);
    }

    @PostMapping("/apis/registrations")
    public ResponseEntity<Boolean> startRegistration2(@RequestBody RegisterModel model) {
        RegisterToConference command = RegisterToConference.of(
                model.getOrderId(),
                model.getConferenceId(),
                Seats.of(model.items
                        .stream()
                        .map(x -> Seat.of(x.getSeatTypeId(), x.getQuantity()))
                        .collect(Collectors.toList())));

        commandBus.send(command);

        // added!!
        OrderState draftOrder = this.waitUntilUpdated(model.getOrderId());

        if (OrderState.BOOKED.equals(draftOrder)) {
            return ResponseEntity.ok(Boolean.TRUE);
        } else if (OrderState.REJECTED.equals(draftOrder)) {
            return ResponseEntity.ok(Boolean.FALSE);
        }

        return ResponseEntity.ok(Boolean.FALSE);
    }

    private OrderState waitUntilUpdated(Long orderId) {
        return null;
    }
}
