package com.shizubro.cardorders.service;

import com.alibaba.fastjson2.JSON;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.shizubro.cardorders.dto.MagicCard;
import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class JsonArrayParser {


    @Test
    public void testJacksonParser() throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        InputStream input = this.getClass().getResourceAsStream("/oracle-cards-20241005210544.json");
        String text = IOUtils.toString(input, "UTF-8");
        List<MagicCard> list = mapper.readerForListOf(MagicCard.class).readValue(text);
        Assertions.assertEquals(33220, list.size());
    }

    @Test
    public void testFastJsonParser() throws IOException {

        InputStream input = this.getClass().getResourceAsStream("/oracle-cards-20241005210544.json");
        String text = IOUtils.toString(input, "UTF-8");
        List<MagicCard> list = JSON.parseArray(text, MagicCard.class);
        Assertions.assertEquals(33220, list.size());
    }
}
