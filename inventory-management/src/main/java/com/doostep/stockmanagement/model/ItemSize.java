package com.doostep.stockmanagement.model;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "items_sizes")
@Data
public class ItemSize extends NamedEntity {

    @NotEmpty
    @Column(name = "metric")
    private String metric;

    @NotEmpty
    @Column(name = "unitOfMeasure")
    private String unitOfMeasure;

    @NotEmpty
    @Column(name = "unitAmount")
    private double unitAmount;

    @ManyToMany
    @JoinColumn(name = "items_size")
    private Set<Item> items;
}
