package edu.esoft.sdp.pickAndGoBackend.service;

import edu.esoft.sdp.pickAndGoBackend.model.Branch;
import edu.esoft.sdp.pickAndGoBackend.model.Vehicle;

import java.util.List;

public interface VehicleService {
    List<?> getAllVehicle();

    Vehicle createVehicle(Vehicle vehicle);

    String deleteVehicle(Integer id);
}
