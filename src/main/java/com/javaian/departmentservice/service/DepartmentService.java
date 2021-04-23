package com.javaian.departmentservice.service;

import com.javaian.departmentservice.entity.Department;
import com.javaian.departmentservice.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(@RequestBody Department department) {
        return departmentRepository.save(department);
    }

    public Optional<Department> getDepartment(Long id) {
        return departmentRepository.findById(id);
    }
}
