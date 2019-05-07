package com.sam.withdrawservice.controller;

import com.sam.withdrawservice.configuration.Configuration;
import com.sam.withdrawservice.configuration.WithdrawConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WithdrawController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/withdraw")
    public WithdrawConfiguration withdrawConfiguration(){

        return new WithdrawConfiguration(configuration.getMaximum(), configuration.getMinimum());
    }

}
