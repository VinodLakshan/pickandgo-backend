package edu.esoft.sdp.pickAndGoBackend.repository;

import edu.esoft.sdp.pickAndGoBackend.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {



}
