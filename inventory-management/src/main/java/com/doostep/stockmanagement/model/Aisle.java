package com.doostep.stockmanagement.model;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;


@Entity
@Table(name = "aisles")
@Data
public class Aisle extends NamedEntity {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "aisle")
    private Set<Category> categories;
}
