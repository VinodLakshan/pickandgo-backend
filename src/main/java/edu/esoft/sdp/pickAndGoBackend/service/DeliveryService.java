package edu.esoft.sdp.pickAndGoBackend.service;

import edu.esoft.sdp.pickAndGoBackend.dto.DeliveryInputDto;
import edu.esoft.sdp.pickAndGoBackend.model.Delivery;

public interface DeliveryService {

    Delivery placeDelevery(DeliveryInputDto deliveryInputDto);
}
