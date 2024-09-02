package com.example.minitest3.repository;

import com.example.minitest3.model.Car;
import com.example.minitest3.model.Manufacturer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICarRepository extends CrudRepository<Car,Long> {
    Iterable<Car> findAllByManufacturer(Manufacturer manufacturer);

    Page<Car> findAll(Pageable pageable);


    Page<Car> findAllByNameContaining(Pageable pageable, String name);
//    dinh nghia phuong thuc truy van
//    tim kiem theo lastName
//    danh sach
//    Phai viet dung theo goi y
//    Page<Customer> findAllByLastNameContaining(Pageable pageable, String name);

}

