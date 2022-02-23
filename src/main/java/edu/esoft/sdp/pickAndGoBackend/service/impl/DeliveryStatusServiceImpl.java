package edu.esoft.sdp.pickAndGoBackend.service.impl;


import edu.esoft.sdp.pickAndGoBackend.model.DeliveryStatus;
import edu.esoft.sdp.pickAndGoBackend.repository.DeliveryStatusRepository;
import edu.esoft.sdp.pickAndGoBackend.service.DeliveryStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryStatusServiceImpl implements DeliveryStatusService {

    @Autowired
    private DeliveryStatusRepository deliveryStatusRepository;

    @Override
    public DeliveryStatus getDeliveryStatusByStatus(String status) {
        return this.deliveryStatusRepository.findByStatus(status);
    }
}
