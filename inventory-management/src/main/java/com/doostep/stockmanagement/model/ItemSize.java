package com.doostep.stockmanagement.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "items_sizes")
@Data
public class ItemSize extends NamedEntity {

    @Column(name = "metric")
    private String metric;

    @Column(name = "unitOfMeasure")
    private String unitOfMeasure;

    @Column(name = "unitAmount")
    private double unitAmount;

    @ManyToMany
    @JoinColumn(name = "items_size")
    private Set<Item> items;
}
