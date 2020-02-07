package com.doostep.stockmanagement.service.interfaces;

import com.doostep.stockmanagement.model.Aisle;


public interface AisleService extends CrudService<Aisle, Long> {

    Aisle findByName(String name);
}
