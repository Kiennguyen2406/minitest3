package com.example.minitest3.service;

import com.example.minitest3.model.DTO.ICountManufacturer;
import com.example.minitest3.model.Manufacturer;

public interface IManufacturerService extends IGenerateService<Manufacturer> {
    void xoaNhaSanXuatTheoId(Long id);

    Iterable<ICountManufacturer> TongHopSoLuongNSX();
}
