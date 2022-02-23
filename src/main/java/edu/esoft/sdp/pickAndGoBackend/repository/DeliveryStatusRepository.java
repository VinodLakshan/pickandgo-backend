package edu.esoft.sdp.pickAndGoBackend.repository;

import edu.esoft.sdp.pickAndGoBackend.model.DeliveryStatus;
import edu.esoft.sdp.pickAndGoBackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryStatusRepository extends JpaRepository<DeliveryStatus, Long> {

    DeliveryStatus findByStatus(String status);
}
