package com.doostep.stockmanagement.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "categories")
@Data
public class Category extends NamedEntity {

    @ManyToOne
    @JoinColumn(name = "aisle_id")
    private Aisle aisle;

    @OneToMany
    @JoinColumn(name = "item_id")
    private Set<Item> itemSet;
}
