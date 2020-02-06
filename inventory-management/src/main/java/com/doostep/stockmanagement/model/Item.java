package com.doostep.stockmanagement.model;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

@Entity
@Table(name = "items")
@Data
public class Item extends NamedEntity {

    @NotEmpty
    @Column(name = "price")
    private double price;

    @NotEmpty
    @Column(name = "description")
    private String description;

    @NotEmpty
    @Column(name = "sku")
    private String sku;

    @ManyToOne
    @JoinColumn(name = "size_id")
    private ItemSize size;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
