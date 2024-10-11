package com.ust.Mapping.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ust.Mapping.model.Employee;
import com.ust.Mapping.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/project/{projectId}")
    public List<Employee> getEmployeesByProject(@PathVariable Long projectId) {
        return employeeService.getEmployeesByProjectId(projectId);
    }

    @GetMapping("/project/{projectId}/failed")
    public List<Employee> getFailedEmployeesByProject(@PathVariable Long projectId) {
        return employeeService.getFailedEmployeesByProjectId(projectId);
    }
}
