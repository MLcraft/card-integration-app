package com.shizubro.cardorders.repository;

import com.shizubro.cardorders.model.CardOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface CardOrderRepository extends JpaRepository<CardOrder, Long> {
}