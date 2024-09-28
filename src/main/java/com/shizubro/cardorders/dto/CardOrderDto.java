package com.shizubro.cardorders.dto;

import com.shizubro.cardorders.enums.OrderStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class CardOrderDto {
    private String requestId;
    private OrderStatus status;
    private List<ListingDto> listings;
    private String customerId;
}
