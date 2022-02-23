package edu.esoft.sdp.pickAndGoBackend.service.impl;

import edu.esoft.sdp.pickAndGoBackend.dto.HistoryDto;
import edu.esoft.sdp.pickAndGoBackend.model.DeliveryDetails;
import edu.esoft.sdp.pickAndGoBackend.repository.BranchRepository;
import edu.esoft.sdp.pickAndGoBackend.repository.DeliveryDetailRepository;
import edu.esoft.sdp.pickAndGoBackend.repository.DeliveryRepository;
import edu.esoft.sdp.pickAndGoBackend.repository.DeliveryStatusRepository;
import edu.esoft.sdp.pickAndGoBackend.service.HistoryService;

import java.util.ArrayList;
import java.util.List;

public class HistoryServiceImpl implements HistoryService {

    private final BranchRepository branchRepository;

    private final DeliveryStatusRepository deliveryStatusRepository;

    private final DeliveryRepository deliveryRepository;

    private final DeliveryDetailRepository deliveryDetailRepository;

    public HistoryServiceImpl(BranchRepository branchRepository, DeliveryStatusRepository deliveryStatusRepository, DeliveryRepository deliveryRepository, DeliveryDetailRepository deliveryDetailRepository) {
        this.branchRepository = branchRepository;
        this.deliveryStatusRepository = deliveryStatusRepository;
        this.deliveryRepository = deliveryRepository;
        this.deliveryDetailRepository = deliveryDetailRepository;
    }


    @Override
    public List<HistoryDto> viewHistoryReport() {
        List<DeliveryDetails> allDeliveries = deliveryDetailRepository.findAll();
        List<HistoryDto> historyDtos = new ArrayList<>();
        for (DeliveryDetails deliveryDetails: allDeliveries) {
            historyDtos.add(new HistoryDto(deliveryDetails.getDateTime(), deliveryDetails.getDeliveryStatus()));
        }
        return historyDtos;
    }
}
