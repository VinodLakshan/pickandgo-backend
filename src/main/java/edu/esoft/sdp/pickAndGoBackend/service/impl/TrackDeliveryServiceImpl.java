package edu.esoft.sdp.pickAndGoBackend.service.impl;

import edu.esoft.sdp.pickAndGoBackend.model.Delivery;
import edu.esoft.sdp.pickAndGoBackend.model.TrackDelivery;
import edu.esoft.sdp.pickAndGoBackend.repository.TrackDeliveryRepository;
import edu.esoft.sdp.pickAndGoBackend.service.TrackDeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrackDeliveryServiceImpl implements TrackDeliveryService
{

    @Autowired
    private TrackDeliveryRepository trackDeliveryRepository;

    @Override
    public void saveTracking(Delivery delivery) {

    }

    @Override
    public TrackDelivery getTrackingByTrackingCode(String TrackCode) {
        return trackDeliveryRepository.getTrackDeliveryByTrackCode(TrackCode);
    }

    @Override
    public TrackDelivery getTrackingByDelivery(Delivery delivery) {
        return trackDeliveryRepository.getTrackDeliveryByDelivery(delivery);
    }
}
