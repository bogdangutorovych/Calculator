package com.serviguidetech.calculator.controller;

import com.serviguidetech.calculator.wrapper.TracerWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import io.corp.calculator.TracerAPI;

@RestController
public class CalculatorController {

    private final TracerAPI tracerAPI;

    @Autowired
    public CalculatorController(TracerWrapper tracerWrapper) {
        this.tracerAPI = tracerWrapper;
    }

    @GetMapping("/add")
    public int add(@RequestParam int operand1, @RequestParam int operand2) {
        int result = operand1 + operand2;
        tracerAPI.trace(result);

        return result;
    }

    @GetMapping("/subtract")
    public int subtract(@RequestParam int operand1, @RequestParam int operand2) {
        int result = operand1 - operand2;
        tracerAPI.trace(result);

        return result;
    }
}
