package com.shizubro.cardorders.dto;

import lombok.*;

import java.io.Serializable;
import java.util.UUID;

@Data
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class ScryfallCardDataDto implements Serializable {
    private UUID id;

    private String cardName;

    private String cardImageUrl;
}