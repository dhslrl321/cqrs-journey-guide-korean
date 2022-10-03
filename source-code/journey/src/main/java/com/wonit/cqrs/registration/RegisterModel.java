package com.wonit.cqrs.registration;

import java.util.List;
import lombok.Data;

@Data
public class RegisterModel {
    Long orderId;
    Long conferenceId;
    List<SeatModel> items;
}