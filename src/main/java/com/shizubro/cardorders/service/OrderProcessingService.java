package com.shizubro.cardorders.service;

import com.shizubro.cardorders.dto.CardOrderDto;
import com.shizubro.cardorders.repository.CardOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderProcessingService {

    @Autowired
    private CardOrderRepository cardOrderRepository;

    public void load(CardOrderDto cardOrder){
        System.out.println(cardOrder);
        System.out.println(cardOrder.getListings());
    }
}
