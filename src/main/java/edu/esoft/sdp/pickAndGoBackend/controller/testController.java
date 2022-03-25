package edu.esoft.sdp.pickAndGoBackend.controller;

import edu.esoft.sdp.pickAndGoBackend.model.Delivery;
import edu.esoft.sdp.pickAndGoBackend.model.TrackDelivery;
import edu.esoft.sdp.pickAndGoBackend.service.EmailService;
import edu.esoft.sdp.pickAndGoBackend.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@CrossOrigin(origins = "*")
public class testController {

    @Autowired
    private EmailService emailService;

    @Autowired
    private ScheduleService scheduleService;

    @GetMapping
    public ResponseEntity test(){
        TrackDelivery trackDelivery = new TrackDelivery(new Delivery());
        //emailService.sendEmail("arunbalathambu@gmail.com", scheduleService.createSchedule(new Delivery()));
        return ResponseEntity.ok(trackDelivery);
    }

    @GetMapping("/auth")
    public ResponseEntity testAuthenticated(){
        return ResponseEntity.ok("Test Authentication Successful");
    }
}
