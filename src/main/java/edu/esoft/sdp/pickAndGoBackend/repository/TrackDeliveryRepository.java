package edu.esoft.sdp.pickAndGoBackend.repository;

import edu.esoft.sdp.pickAndGoBackend.model.Delivery;
import edu.esoft.sdp.pickAndGoBackend.model.TrackDelivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackDeliveryRepository extends JpaRepository<TrackDelivery,Integer> {

    @Query("select TD from TrackDelivery TD where TD.delivery = :delivery")
    TrackDelivery getTrackDeliveryByDelivery(Delivery delivery);

    @Query("select TD from TrackDelivery TD where TD.TrackCode = :trackCode")
    TrackDelivery getTrackDeliveryByTrackCode(String trackCode);

}
