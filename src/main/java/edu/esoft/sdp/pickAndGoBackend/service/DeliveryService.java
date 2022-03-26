package edu.esoft.sdp.pickAndGoBackend.service;

import edu.esoft.sdp.pickAndGoBackend.dto.DeliveryInputDto;
import edu.esoft.sdp.pickAndGoBackend.model.Delivery;

public interface DeliveryService {

    Delivery placeDelevery(DeliveryInputDto deliveryInputDto) throws Exception;
    List<Delivery> getAllDeliveries();
    boolean allocatePerson(AllocationDto allocationDto);
    NearestBranchOutPutDto getNearestBranches(NearestBranchInputDto nearestBranchInputDto) throws Exception;
}
