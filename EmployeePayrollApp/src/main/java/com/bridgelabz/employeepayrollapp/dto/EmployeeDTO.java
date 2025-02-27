package com.bridgelabz.employeepayrollapp.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

public class EmployeeDTO {
	@NotEmpty(message = "Name cannot be empty")
	@Pattern(regexp = "^[A-Z][a-zA-Z\\s]+$", message = "Name should start with uppercase")
	private String name;
	
	@Min(value = 5000, message = "Salary should be at least 5000")
    private Double salary;
	
	public EmployeeDTO(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}