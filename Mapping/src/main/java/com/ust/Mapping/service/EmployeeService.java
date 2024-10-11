package com.ust.Mapping.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.Mapping.model.Employee;
import com.ust.Mapping.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getEmployeesByProjectId(Long projectId) {
        return employeeRepository.findByProjectId(projectId);
    }

    public List<Employee> getFailedEmployeesByProjectId(Long projectId) {
        return employeeRepository.findFailedEmployeesByProjectId(projectId);
    }
}
