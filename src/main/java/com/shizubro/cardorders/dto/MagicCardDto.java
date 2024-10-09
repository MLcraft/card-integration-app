package com.shizubro.cardorders.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;
import java.util.UUID;

@Data
@ToString
public class MagicCardDto {
    @JsonProperty("id")
    private UUID id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("image_uris")
    private ImageUris imageUris;

    @Data
    @ToString
    public static class ImageUris {
        @JsonProperty("small")
        private String small;

        @JsonProperty("large")
        private String large;

        @JsonProperty("normal")
        private String normal;

        @JsonProperty("png")
        private String png;

        @JsonProperty("art_crop")
        private String artCrop;

        @JsonProperty("border_crop")
        private String borderCrop;
    }
}

