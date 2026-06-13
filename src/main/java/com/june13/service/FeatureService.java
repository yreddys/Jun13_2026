package com.june13.service;


import com.june13.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class FeatureService {

    private Map<Integer, Employee> employees = new HashMap<>();

    public void create(Employee emp) {
        employees.put(emp.getEmpId(), emp);
    }
}