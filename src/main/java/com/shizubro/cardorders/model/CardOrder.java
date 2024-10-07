package com.shizubro.cardorders.model;

import com.shizubro.cardorders.dto.enums.OrderStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "card_order")
public class CardOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @CreationTimestamp
    private Instant createDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private OrderStatus status;

    @OneToMany
    @JoinColumn(name="listing_id", nullable=false)
    private List<Listing> listings;

    @Column(name = "customer_id", nullable = false)
    private String customerId;
}