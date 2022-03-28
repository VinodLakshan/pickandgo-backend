package edu.esoft.sdp.pickAndGoBackend.service;

import edu.esoft.sdp.pickAndGoBackend.dto.DeliveryInputDto;
import edu.esoft.sdp.pickAndGoBackend.model.Delivery;

import java.util.List;

public interface DeliveryService {

    Delivery placeDelevery(DeliveryInputDto deliveryInputDto) throws Exception;

    List<?> BranchManagerOngoingAndHistory (int branchId, int status);
    List<?> CustomerOngoingAndHistory (int customerId, int status);
}
