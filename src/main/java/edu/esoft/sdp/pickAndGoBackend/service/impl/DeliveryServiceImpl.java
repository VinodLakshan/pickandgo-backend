package edu.esoft.sdp.pickAndGoBackend.service.impl;

import edu.esoft.sdp.pickAndGoBackend.common.Common;
import edu.esoft.sdp.pickAndGoBackend.dto.*;
import edu.esoft.sdp.pickAndGoBackend.model.*;
import edu.esoft.sdp.pickAndGoBackend.repository.DeliveryRepository;
import edu.esoft.sdp.pickAndGoBackend.service.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service
@Slf4j
public class DeliveryServiceImpl implements DeliveryService {

    @Autowired
    private DeliveryRepository deliveryRepository;
    @Autowired
    private ItemService itemService;
    @Autowired
    private SenderService senderService;
    @Autowired
    private ReceiverService receiverService;
    @Autowired
    private UserService userService;
    @Autowired
    private BranchService branchService;
    @Autowired
    private DeliveryStatusService deliveryStatusService;
    @Autowired
    private DeliveryDetailService deliveryDetailService;

    @Override
    public Delivery placeDelevery(DeliveryInputDto deliveryInputDto) throws Exception{
        try {
            //  saving sender and receiver
            Sender newSender = this.senderService.createNewSender(deliveryInputDto.getSender());
            Receiver newReceiver = this.receiverService.createNewReceiver(deliveryInputDto.getReceiver());

            // get user details
            User userById = this.userService.getUserByUsername(deliveryInputDto.getUser().getUsername());

            // get pickUpBranch details
            Branch branchById = this.branchService.getBranchById(deliveryInputDto.getPickupBranch().getBranchId());

            // get dropOffBranch details
            Branch dropbranchById = this.branchService.getBranchById(deliveryInputDto.getDestinationBranch().getBranchId());

            // Saving deliver details
            Delivery newDelivery = new Delivery(0, deliveryInputDto.getScheduledPickupAt(), deliveryInputDto.getDate(),
                    deliveryInputDto.getPickUpLongitute(), deliveryInputDto.getPickupLatitute(), deliveryInputDto.getScheduledDeliverAt(),
                    deliveryInputDto.getDeliverLongitute(), deliveryInputDto.getDeliverLatitute(), deliveryInputDto.getTotalAmount(),
                    userById, newReceiver, newSender, null, branchById, dropbranchById, null);

            Delivery savedDelivery = this.deliveryRepository.save(newDelivery);

            // saving items included in the delivery request
            for (Item item : deliveryInputDto.getItems()) {
                item.setDelivery(savedDelivery);
                this.itemService.createIem(item);
            }

            // saving initial delivery detail
            DeliveryStatus getInitialStatus = this.deliveryStatusService.getDeliveryStatusByStatus("NEW");
            DeliveryDetails savedDeliveryDetail = new DeliveryDetails(0, new Date().toString(),
                    userById.getName() + " has initiated the delivery request.", getInitialStatus, savedDelivery);
            this.deliveryDetailService.createNewDeliveryDetail(savedDeliveryDetail);

            return savedDelivery;

        }catch (Exception exception){
            System.out.println("Something went wrong with the make request trasaction" +exception.getMessage());
            throw new Exception("Something went wrong with the make request trasaction",exception);
        }
    }

    @Override
    public NearestBranchOutPutDto getNearestBranches(NearestBranchInputDto nearestBranchInputDto) throws Exception {
        List<Branch> allBranches = branchService.getAllBranches();
        ArrayList<BranchDistance> pickUpMap = new ArrayList<>();
        ArrayList<BranchDistance> dropOffUpMap = new ArrayList<>();
        for (Branch br: allBranches) {
            DistanceTime distanceTime = Common.calculateDistance(new Location(Double.toString(br.getLatitude()), Double.toString(br.getLongitude())),
                    new Location(nearestBranchInputDto.getPickUpLat(), nearestBranchInputDto.getPickUpLng()));
            pickUpMap.add(new BranchDistance(distanceTime.getDistance().getValue(),br));

            DistanceTime distanceTime2 = Common.calculateDistance(new Location(Double.toString(br.getLatitude()), Double.toString(br.getLongitude())),
                    new Location(nearestBranchInputDto.getDropOffLat(), nearestBranchInputDto.getDropOffLng()));
            dropOffUpMap.add(new BranchDistance(distanceTime2.getDistance().getValue(),br));
        }

        BranchDistance bp = null;
        for (BranchDistance b:pickUpMap) {
            if(bp == null){
                bp = b;
            }else if (b.getDistance() < bp.getDistance()){
                bp = b;
            }
        }

        BranchDistance bd = null;
        for (BranchDistance b:dropOffUpMap) {
            if(bd == null){
                bd = b;
            }else if (b.getDistance() < bd.getDistance()){
                bd = b;
            }
        }

        System.out.println(bp.getBranch().getDistrict());
        System.out.println(bd.getBranch().getDistrict());

        return new NearestBranchOutPutDto(bp.getBranch(),bd.getBranch());
    }
}
