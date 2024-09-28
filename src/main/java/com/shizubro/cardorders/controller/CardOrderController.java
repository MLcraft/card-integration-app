package com.shizubro.cardorders.controller;

import com.shizubro.cardorders.dto.CardOrderDto;
import com.shizubro.cardorders.model.CardOrder;
import com.shizubro.cardorders.service.OrderProcessingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class CardOrderController {
    @Autowired
    OrderProcessingService orderProcessingService;

    // search for all prices for cardName
    @PostMapping(path = "/addOrder",
                 consumes = MediaType.APPLICATION_JSON_VALUE,
                 produces = MediaType.APPLICATION_JSON_VALUE)
    public String loadCardOrderToDB(@RequestBody CardOrderDto data) {
        orderProcessingService.load(data);
        return "Request completed";
    }
}
