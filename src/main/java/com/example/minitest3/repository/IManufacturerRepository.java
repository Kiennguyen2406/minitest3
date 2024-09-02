package com.example.minitest3.repository;

import com.example.minitest3.model.DTO.ICountManufacturer;
import com.example.minitest3.model.Manufacturer;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IManufacturerRepository extends CrudRepository<Manufacturer,Long> {
    //query de sua du lieu
    @Modifying
//query de thuc hien nhieu thao tac
    @Transactional
    @Query(value = "CALL deleteManufacturer(:id)", nativeQuery = true)
    void xoaNhaSanXuatTheoId(@Param("id")Long id);

    @Query(nativeQuery = true, value = "CALL findNameManuAndCountIdCar()")
    Iterable<ICountManufacturer> TongHopSoLuongNSX();
}
