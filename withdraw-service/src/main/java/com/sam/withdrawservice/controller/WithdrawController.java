package com.sam.withdrawservice.controller;

import com.sam.withdrawservice.configuration.WithdrawConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WithdrawController {

    @GetMapping("/withdraw")
    public WithdrawConfiguration withdrawConfiguration(){

        return new WithdrawConfiguration(1000, 1);
    }

}
