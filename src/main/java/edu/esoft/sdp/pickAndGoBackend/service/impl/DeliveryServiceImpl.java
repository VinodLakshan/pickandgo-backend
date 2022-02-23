package edu.esoft.sdp.pickAndGoBackend.service.impl;

import edu.esoft.sdp.pickAndGoBackend.dto.DeliveryInputDto;
import edu.esoft.sdp.pickAndGoBackend.model.Delivery;
import edu.esoft.sdp.pickAndGoBackend.repository.DeliveryRepository;
import edu.esoft.sdp.pickAndGoBackend.service.DeliveryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DeliveryServiceImpl implements DeliveryService {

    @Autowired
    private DeliveryRepository deliveryRepository;

    @Override
    public Delivery placeDelevery(DeliveryInputDto deliveryInputDto) {
        return null;
    }
}
