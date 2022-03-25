package edu.esoft.sdp.pickAndGoBackend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Tracking")
public class TrackDeliveryController
{
    @GetMapping("/TrackByTrackingCode/{trackCode}")
    public ResponseEntity<?> getTrackingByTrackCode(@PathVariable String trackCode)
    {
        return ResponseEntity.ok(trackCode);
    }
}
