package com.example.minitest3.service;

import com.example.minitest3.model.Car;
import com.example.minitest3.model.Manufacturer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICarService extends IGenerateService<Car>{
    Iterable<Car> findAllByManufacturer(Manufacturer manufacturer);
    Page<Car> findAll(Pageable pageable);

    Page<Car> findAllByNameContaining(Pageable pageable, String name);
}
