package com.ust.Mapping.model;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String projectName;

    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Employee> employees;

    @OneToOne(mappedBy = "project", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JsonManagedReference
    private Interview interview;


}
