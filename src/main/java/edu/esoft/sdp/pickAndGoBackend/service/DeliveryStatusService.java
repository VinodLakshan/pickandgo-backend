package edu.esoft.sdp.pickAndGoBackend.service;

import edu.esoft.sdp.pickAndGoBackend.model.DeliveryStatus;
import edu.esoft.sdp.pickAndGoBackend.model.User;

public interface DeliveryStatusService {
    DeliveryStatus getDeliveryStatusByStatus(String status);
}
