package edu.esoft.sdp.pickAndGoBackend.service.impl;

import edu.esoft.sdp.pickAndGoBackend.dto.DeliveryInputDto;
import edu.esoft.sdp.pickAndGoBackend.model.*;
import edu.esoft.sdp.pickAndGoBackend.repository.DeliveryRepository;
import edu.esoft.sdp.pickAndGoBackend.service.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

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
            User userById = this.userService.getUserById(deliveryInputDto.getUser().getId());

            // get pickUpBranch details
            Branch branchById = this.branchService.getBranchById(deliveryInputDto.getPickupBranch().getBranchId());

            // Saving deliver details
            Delivery newDelivery = new Delivery(0, deliveryInputDto.getScheduledPickupAt(), deliveryInputDto.getDate(),
                    deliveryInputDto.getPickUpLongitute(), deliveryInputDto.getPickupLatitute(), deliveryInputDto.getScheduledDeliverAt(),
                    deliveryInputDto.getDeliverLongitute(), deliveryInputDto.getDeliverLatitute(), deliveryInputDto.getTotalAmount(),
                    userById, newReceiver, newSender, null, branchById, null, null);

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
}