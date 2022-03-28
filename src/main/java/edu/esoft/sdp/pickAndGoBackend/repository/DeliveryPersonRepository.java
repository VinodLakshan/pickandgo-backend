package edu.esoft.sdp.pickAndGoBackend.repository;

import edu.esoft.sdp.pickAndGoBackend.model.DeliveryPerson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryPersonRepository extends JpaRepository<DeliveryPerson, Long> {
}
