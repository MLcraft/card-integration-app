package com.shizubro.cardorders.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "bulk_object")
public class BulkObject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "data_id", nullable = false)
    private UUID dataId;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "download_uri", nullable = false)
    private String downloadUri;

}