package edu.esoft.sdp.pickAndGoBackend.repository;

import edu.esoft.sdp.pickAndGoBackend.model.Receiver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceiverRepository extends JpaRepository<Receiver, Long> {
}