package com.ezycoding.sbjpa.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "LAPTOPS")
@Data
public class Laptop {
    @Id
    @GeneratedValue
    private Integer id;
    private String serial;
}