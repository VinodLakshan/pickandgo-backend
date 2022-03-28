package edu.esoft.sdp.pickAndGoBackend.controller;

import edu.esoft.sdp.pickAndGoBackend.model.TrackDelivery;
import edu.esoft.sdp.pickAndGoBackend.service.TrackDeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Tracking")
@CrossOrigin(origins = "*")
public class TrackDeliveryController
{
    @Autowired
    private TrackDeliveryService trackDeliveryService;

    @GetMapping("/TrackByTrackingCode/{trackCode}")
    public ResponseEntity<?> getTrackingByTrackCode(@PathVariable String trackCode)
    {
        //return ResponseEntity.ok(trackDeliveryService.getTrackingByTrackingCode(trackCode));
        return ResponseEntity.ok(new TrackDelivery());
    }
}
