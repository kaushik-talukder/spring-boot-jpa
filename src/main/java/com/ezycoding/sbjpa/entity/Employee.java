package com.ezycoding.sbjpa.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "EMPLOYEES")
@Data
public class Employee {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "laptopId", referencedColumnName = "id")
    private Laptop laptop;

    @ManyToMany
    @JoinTable(
            name = "EmployeesRoles",
            joinColumns = @JoinColumn(name = "employeeId"),
            inverseJoinColumns = @JoinColumn(name = "roleId")
    )
    private Set<Role> roles;

}