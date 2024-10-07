package com.shizubro.cardorders.service.impl;

import com.shizubro.cardorders.dto.CardOrderDto;
import com.shizubro.cardorders.repository.CardOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderProcessingService {


    private CardOrderRepository cardOrderRepository;

    @Autowired
    public void OrderProcessing(CardOrderRepository cardOrderRepository) {
        this.cardOrderRepository = cardOrderRepository;
    }

    public void load(CardOrderDto cardOrder){
        System.out.println(cardOrder);
        System.out.println(cardOrder.getListings());
    }
}
