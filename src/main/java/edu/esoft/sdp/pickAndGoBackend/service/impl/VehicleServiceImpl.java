package edu.esoft.sdp.pickAndGoBackend.service.impl;

import edu.esoft.sdp.pickAndGoBackend.model.Branch;
import edu.esoft.sdp.pickAndGoBackend.model.Vehicle;
import edu.esoft.sdp.pickAndGoBackend.repository.VehicleRepository;
import edu.esoft.sdp.pickAndGoBackend.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService {
    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public List<?> getAllVehicle() {
        return vehicleRepository.findAll();
    }

    @Override
    public Vehicle createVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Override
    public String deleteVehicle(Integer id) {
        vehicleRepository.deleteById(id);
        return "Branch with ID " + id + " Has Been Removed Successfully";
    }


}
