package com.doostep.stockmanagement.repository;

import com.doostep.stockmanagement.model.Aisle;
import com.doostep.stockmanagement.service.CrudService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;


public interface AisleRepository extends JpaRepository<Aisle, Long> {

    Aisle findByName(String name);
}
