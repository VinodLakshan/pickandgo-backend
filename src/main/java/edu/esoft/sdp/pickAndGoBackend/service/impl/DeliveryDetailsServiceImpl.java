package edu.esoft.sdp.pickAndGoBackend.service.impl;

import edu.esoft.sdp.pickAndGoBackend.model.DeliveryDetails;
import edu.esoft.sdp.pickAndGoBackend.repository.DeliveryDetailRepository;
import edu.esoft.sdp.pickAndGoBackend.service.DeliveryDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryDetailsServiceImpl implements DeliveryDetailService {

    @Autowired
    private DeliveryDetailRepository deliveryDetailRepository;

    @Override
    public DeliveryDetails createNewDeliveryDetail(DeliveryDetails deliveryDetails) {
        return this.deliveryDetailRepository.save(deliveryDetails);
    }
}
