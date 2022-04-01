package edu.esoft.sdp.pickAndGoBackend.controller;

import edu.esoft.sdp.pickAndGoBackend.model.Branch;
import edu.esoft.sdp.pickAndGoBackend.model.Vehicle;
import edu.esoft.sdp.pickAndGoBackend.service.VehicleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Vehicle")
@CrossOrigin(origins = "*")
@Slf4j
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;

    @GetMapping("/getAllVehicles")
    public ResponseEntity<?> getAllVehicle()
    {
        return ResponseEntity.ok(vehicleService.getAllVehicle());
    }

    @PostMapping()
    public Vehicle createNewVehicle (@RequestBody Vehicle vehicle) {
        log.info("New Vehicle Has been Created");
        return vehicleService.createVehicle(vehicle);
    }

    @DeleteMapping("/{id}")
    public String deleteVehicle (@PathVariable Integer id) {
        log.info("A Vehicle has been Deleted");
        return vehicleService.deleteVehicle(id);
    }


}
