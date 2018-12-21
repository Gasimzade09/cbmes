package com.employe.cbmes.service;

import com.employe.cbmes.dao.EmployeeDao;
import com.employe.cbmes.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeDao dao;

    public EmployeeService(EmployeeDao dao) {
        this.dao = dao;
    }

    public List<Employee> getEmployees(){
        return dao.findAll();
    }

    public Employee save(Employee employee){
        return dao.save(employee);
    }

}
