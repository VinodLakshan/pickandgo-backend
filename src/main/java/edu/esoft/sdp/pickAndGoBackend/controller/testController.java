package edu.esoft.sdp.pickAndGoBackend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class testController {

    @GetMapping
    public ResponseEntity test(){
        return ResponseEntity.ok("Test Successful");
    }

    @GetMapping("/auth")
    public ResponseEntity testAuthenticated(){
        return ResponseEntity.ok("Test Authentication Successful");
    }
}
