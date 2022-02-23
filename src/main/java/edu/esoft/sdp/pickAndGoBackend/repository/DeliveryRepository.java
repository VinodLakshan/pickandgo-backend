package edu.esoft.sdp.pickAndGoBackend.repository;

import edu.esoft.sdp.pickAndGoBackend.model.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryRepository extends JpaRepository<Delivery, Long> {
}
