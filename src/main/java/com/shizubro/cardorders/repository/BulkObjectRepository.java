package com.shizubro.cardorders.repository;

import com.shizubro.cardorders.model.BulkObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface BulkObjectRepository extends JpaRepository<BulkObject, Long> {
}