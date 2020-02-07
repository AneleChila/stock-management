package com.doostep.stockmanagement.repository.interfaces;

import com.doostep.stockmanagement.model.Aisle;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AisleRepository extends JpaRepository<Aisle, Long> {

    Aisle findByName(String name);
}
