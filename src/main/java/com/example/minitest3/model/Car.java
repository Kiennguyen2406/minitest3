package com.example.minitest3.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity //Đánh dấu đây là Entity=>hibernate se tao bang co so du lieu
@Data
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//danh dau tt tu tang
    private Long id;
    private String code;
    private String name;

    private double price;
    private String description;
    private String img;

    @ManyToOne //đánh dau moi quan he n-1
    @JoinColumn(name = "manufactuer_id") //dat ten cho truong khoa ngoai la manufactuer_id
    private Manufacturer manufacturer;


    }


