package edu.esoft.sdp.pickAndGoBackend.controller;

import edu.esoft.sdp.pickAndGoBackend.dto.DeliveryInputDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path="/delivery")
@Slf4j
public class DeliveryController {

    @PostMapping("/make-delivery")
    public ResponseEntity<?> placeDelivery(@RequestBody DeliveryInputDto deliveryInputDto){
        log.info("delivery controller called......");
        return ResponseEntity.ok(deliveryInputDto);
    }
}
