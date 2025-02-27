package com.bridgelabz.employeepayrollapp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;
import com.bridgelabz.employeepayrollapp.repository.EmployeeRepository;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    
    public List<EmployeeDTO> getEmployees() {
        // Return list of employees
    }
    
    public EmployeeDTO getEmployeeById(Long id) {
        // Return employee details
    }
    
    public EmployeeDTO createEmployee(EmployeeDTO employee) {
        // Create employee
    }
    
    public EmployeeDTO updateEmployee(Long id, EmployeeDTO employee) {
        // Update employee
    }
    
    public void deleteEmployee(Long id) {
        // Delete employee
    }
}

