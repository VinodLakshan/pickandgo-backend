package edu.esoft.sdp.pickAndGoBackend.controller;

import edu.esoft.sdp.pickAndGoBackend.model.Delivery;
import edu.esoft.sdp.pickAndGoBackend.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class testController {

    @Autowired
    private ScheduleService scheduleService;

    @GetMapping
    public ResponseEntity test(){
        scheduleService.createSchedule(new Delivery());
        return ResponseEntity.ok("Test Successful");
    }

    @GetMapping("/auth")
    public ResponseEntity testAuthenticated(){
        return ResponseEntity.ok("Test Authentication Successful");
    }
}
