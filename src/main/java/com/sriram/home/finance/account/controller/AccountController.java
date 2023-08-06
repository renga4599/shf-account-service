package com.sriram.home.finance.account.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/api/v1/getMessage")
    public ResponseEntity<String> getMessage(){
        return new ResponseEntity<>("SUCCESSS", HttpStatus.OK);
    }
}
