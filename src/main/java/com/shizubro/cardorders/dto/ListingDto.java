package com.shizubro.cardorders.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ListingDto {
    private Long cardId;
    private String name;
    private Integer quantity;
}
