package edu.esoft.sdp.pickAndGoBackend.service;

import edu.esoft.sdp.pickAndGoBackend.model.Delivery;
import edu.esoft.sdp.pickAndGoBackend.model.TrackDelivery;

public interface TrackDeliveryService {
    void saveTracking(Delivery delivery);
//    TrackDelivery getTrackingByTrackingCode(String TrackCode);
//    TrackDelivery getTrackingByDelivery(Delivery delivery);
}
