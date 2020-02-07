package com.doostep.stockmanagement.model;

import lombok.Data;

import javax.persistence.*;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name = "items")
@Data
public class Item extends NamedEntity {

    @Column(name = "price")
    private double price;

    @Column(name = "description")
    private String description;

    @Column(name = "sku")
    private String sku;

    @ManyToOne
    @JoinColumn(name = "size_id")
    private ItemSize size;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
