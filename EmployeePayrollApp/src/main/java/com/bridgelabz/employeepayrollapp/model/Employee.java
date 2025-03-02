package com.bridgelabz.employeepayrollapp.model;

import java.time.LocalDate;
import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
@Data
public class Employee {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String name;

	    private String gender;

	    private LocalDate startDate;

	    private String note;

	    private String profilePic;

	    private String department;

	    private Double salary;
}
