package com.rohit26.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitConfigurationController {
    @Autowired
    Configuration configuration;
    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitFromConfiguration()
    {
        return new LimitConfiguration(configuration.getMinimum(),configuration.getMaximum());

    }
}
