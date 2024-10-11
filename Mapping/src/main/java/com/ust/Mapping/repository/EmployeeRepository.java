package com.ust.Mapping.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ust.Mapping.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByProjectId(Long projectId);

    @Query("SELECT e FROM Employee e JOIN e.interview i WHERE e.project.id = :projectId AND i.status = 'Fail'")
    List<Employee> findFailedEmployeesByProjectId(Long projectId);
}
