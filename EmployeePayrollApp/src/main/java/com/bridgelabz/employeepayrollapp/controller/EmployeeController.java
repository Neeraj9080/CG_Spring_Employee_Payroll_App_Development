package com.bridgelabz.employeepayrollapp.controller;

import org.springframework.web.bind.annotation.*;

import com.bridgelabz.EmployeePayrollApp.model.EmployeePayroll;
import com.bridgelabz.EmployeePayrollApp.services.EmployeePayrollService;
import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @GetMapping
    public List<EmployeeDTO> getEmployees() {
        // Return list of employees
    }
    
    @GetMapping("/{id}")
    public EmployeeDTO getEmployeeById(@PathVariable Long id) {
        // Return employee details
    }
    
    @PostMapping
    public EmployeeDTO createEmployee(@RequestBody EmployeeDTO employee) {
        // Create employee
    }
    
    @PutMapping("/{id}")
    public EmployeeDTO updateEmployee(@PathVariable Long id, @RequestBody EmployeeDTO employee) {
        // Update employee
    }
    
    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        // Delete employee
    }
}
