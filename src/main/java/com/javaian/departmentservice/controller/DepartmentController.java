package com.javaian.departmentservice.controller;

import com.javaian.departmentservice.entity.Department;
import com.javaian.departmentservice.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/department")
@Slf4j
public class DepartmentController {

    private Logger loggerFactory =LoggerFactory.getLogger(DepartmentController.class);

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/create")
    public Department saveDepartment(@RequestBody Department department) {
        loggerFactory.info("Creating department");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Optional<Department> getDepartment(@PathVariable Long id) {
        loggerFactory.info("Retrieving department");
        return departmentService.getDepartment(id);
    }
}
