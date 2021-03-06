package com.ezycoding.sbjpa.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "ROLES")
public class Role {
    @Id
    @GeneratedValue
    private Integer id;
    private String role;
}