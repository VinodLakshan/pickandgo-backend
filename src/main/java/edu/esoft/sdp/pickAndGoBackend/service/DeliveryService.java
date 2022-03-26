package edu.esoft.sdp.pickAndGoBackend.service;

import edu.esoft.sdp.pickAndGoBackend.dto.AllocationDto;
import edu.esoft.sdp.pickAndGoBackend.dto.DeliveryInputDto;
import edu.esoft.sdp.pickAndGoBackend.dto.NearestBranchInputDto;
import edu.esoft.sdp.pickAndGoBackend.dto.NearestBranchOutPutDto;
import edu.esoft.sdp.pickAndGoBackend.model.Delivery;

import java.util.List;

public interface DeliveryService {

    Delivery placeDelevery(DeliveryInputDto deliveryInputDto) throws Exception;
    List<Delivery> getAllDeliveries();
    boolean allocatePerson(AllocationDto allocationDto);
    NearestBranchOutPutDto getNearestBranches(NearestBranchInputDto nearestBranchInputDto) throws Exception;
}
