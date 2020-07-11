package com.ezycoding.sbjpa.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "EMPLOYEES_ROLES")
@IdClass(EmployeeRolePrimaryKey.class)
public class EmployeeRole {
    @Id
    private Integer employeeId;
    @Id
    private Integer roleId;
}
