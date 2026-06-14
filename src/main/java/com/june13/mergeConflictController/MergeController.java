package com.june13.mergeConflictController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MergeController {
    @GetMapping("/merge")
    public String mergeTest(){

        return "Hello from Main";

    }
}
