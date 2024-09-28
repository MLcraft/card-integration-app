package com.shizubro.cardorders.repository;

import com.shizubro.cardorders.model.Listing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListingRepository extends JpaRepository<Listing, Long> {
}