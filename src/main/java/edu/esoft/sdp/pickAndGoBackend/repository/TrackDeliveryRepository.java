package edu.esoft.sdp.pickAndGoBackend.repository;

import edu.esoft.sdp.pickAndGoBackend.model.Delivery;
import edu.esoft.sdp.pickAndGoBackend.model.TrackDelivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackDeliveryRepository extends JpaRepository<TrackDelivery,Integer> {
//    TrackDelivery getTrackDeliveryByDelivery(Delivery delivery);
//    TrackDelivery getTrackDeliveryByTrackCode(String trackCode);

}
