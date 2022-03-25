package edu.esoft.sdp.pickAndGoBackend.controller;

import edu.esoft.sdp.pickAndGoBackend.dto.DeliveryInputDto;
import edu.esoft.sdp.pickAndGoBackend.dto.NearestBranchInputDto;
import edu.esoft.sdp.pickAndGoBackend.dto.NearestBranchOutPutDto;
import edu.esoft.sdp.pickAndGoBackend.model.Delivery;
import edu.esoft.sdp.pickAndGoBackend.service.DeliveryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path="/delivery")
@Slf4j
public class DeliveryController {

    @Autowired
    private DeliveryService deliveryService;

    @PostMapping("/make-delivery")
    public ResponseEntity<?> placeDelivery(@RequestBody DeliveryInputDto deliveryInputDto){
        try{
            Delivery delivery = deliveryService.placeDelevery(deliveryInputDto);
            return ResponseEntity.ok(delivery);
        }catch (Exception exception){
            return null;
        }

    }

    @PostMapping("/nearestBranches")
    public NearestBranchOutPutDto getNerestBranches(@RequestBody NearestBranchInputDto nearestBranchInputDto)throws Exception{
        return deliveryService.getNearestBranches(nearestBranchInputDto);
    }
}
