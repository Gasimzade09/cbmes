package com.employe.cbmes.controller;

import com.employe.cbmes.model.Employee;
import com.employe.cbmes.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class EmployeeController {
    private final EmployeeService service;

    public EmployeeController(EmployeeService employeeService) {
        this.service = employeeService;
    }

    @GetMapping("/employes")
    public List<Employee> getAllContracts() {
        return service.getEmployees();
    }

    @PostMapping("/employes/save")
    public Employee save(@Valid @RequestBody Employee employee) {
        return service.save(employee);
    }
}
