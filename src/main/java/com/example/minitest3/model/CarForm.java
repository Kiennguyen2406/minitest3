package com.example.minitest3.model;


import lombok.Data;
import org.springframework.web.multipart.MultipartFile;


@Data
public class CarForm {
    private Long id;
    private String code;
    private String name;
    private double price;
    private String description;
    private MultipartFile img;
    private Manufacturer manufacturer; // Sử dụng ID của Manufacturer để giữ khóa ngoại



    // Phương thức để chuyển đổi từ CarForm sang Car
}
