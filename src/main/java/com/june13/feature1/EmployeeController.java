package com.june13.feature1;

import com.june13.entity.Employee;
import com.june13.service.FeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private FeatureService fService;
    @GetMapping("/feature")
    public String featureTest(){
        return "feature branch added";
    }

    @PostMapping("/saveEmp")
    public String saveFeature(@RequestBody Employee emp) {
        fService.create(emp);
        return "Employee saved successfully";
    }
}
