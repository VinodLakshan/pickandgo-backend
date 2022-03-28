package edu.esoft.sdp.pickAndGoBackend.controller;

import edu.esoft.sdp.pickAndGoBackend.service.DeliveryPersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path="/delivery-person")
@Slf4j
public class DeliveryPersonController {

    @Autowired
    private DeliveryPersonService deliveryPersonService;

    @GetMapping
    public ResponseEntity<?> getAllPerson() {
        try{
            return ResponseEntity.ok(deliveryPersonService.getAllPerson());
        }catch (Exception exception){
            return null;
        }
    }
}
