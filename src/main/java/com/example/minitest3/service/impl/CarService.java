package com.example.minitest3.service.impl;

import com.example.minitest3.model.Car;
import com.example.minitest3.model.Manufacturer;
import com.example.minitest3.repository.ICarRepository;
import com.example.minitest3.service.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarService implements ICarService {


    @Autowired

    private ICarRepository iCarRepository;


    @Override
    public Iterable<Car> findAll() {
        return iCarRepository.findAll();
    }

    @Override
    public void save(Car car) {
        iCarRepository.save(car);
    }

    @Override
    public Optional<Car> findById(Long id) {
        return iCarRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        iCarRepository.deleteById(id);
    }

    @Override
    public Iterable<Car> findAllByManufacturer(Manufacturer manufacturer) {
        return iCarRepository.findAllByManufacturer(manufacturer);
    }

    @Override
    public Page<Car> findAll(Pageable pageable) {
        return iCarRepository.findAll(pageable);
    }

    @Override
    public Page<Car> findAllByNameContaining(Pageable pageable, String name) {
        return iCarRepository.findAllByNameContaining(pageable,name);
    }

}

