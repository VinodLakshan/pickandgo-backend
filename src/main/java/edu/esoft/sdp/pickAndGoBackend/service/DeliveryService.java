package edu.esoft.sdp.pickAndGoBackend.service;

import edu.esoft.sdp.pickAndGoBackend.dto.DeliveryInputDto;
import edu.esoft.sdp.pickAndGoBackend.dto.NearestBranchInputDto;
import edu.esoft.sdp.pickAndGoBackend.dto.NearestBranchOutPutDto;
import edu.esoft.sdp.pickAndGoBackend.model.Delivery;

public interface DeliveryService {

    Delivery placeDelevery(DeliveryInputDto deliveryInputDto) throws Exception;
    NearestBranchOutPutDto getNearestBranches(NearestBranchInputDto nearestBranchInputDto) throws Exception;
}
