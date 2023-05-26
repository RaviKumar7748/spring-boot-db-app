package com.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "EMPLOYEE_TAB")
public class Employee {
    @Id
    @Column(name = "EMPLOYEE_ID")
	private Integer eid;
    @Column(name = "EMPLOYEE_NAME")
	private String ename;
    @Column(name = "EMPLOYEE_DEP")
	private String edep;
    @Column(name = "EMPLOYEE_SAL")
	private Integer esal;

}
