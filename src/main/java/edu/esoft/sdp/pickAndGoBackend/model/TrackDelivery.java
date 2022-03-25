package edu.esoft.sdp.pickAndGoBackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
public class TrackDelivery
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    private Delivery delivery;
    private String TrackCode;
    private int pickUpPersonAssigned;
    private LocalDateTime pickUpPersonAssignedTime;
    private int pickedUp;
    private LocalDateTime pickedUpTime;
    private int reachCustomerBranch;
    private LocalDateTime reachCustomerBranchTime;
    private int dispatchToVehicle;
    private LocalDateTime dispatchToVehicleTime;
    private int reachReceiverBranch;
    private LocalDateTime reachReceiverBranchTime;
    private int deliverPersonAssigned;
    private LocalDateTime deliverPersonAssignedTime;
    private int deliver;
    private LocalDateTime deliverTime;

    public TrackDelivery(Delivery delivery)
    {
        this.TrackCode = UUID.randomUUID().toString();
        this.delivery = delivery;
        this.pickUpPersonAssigned = 1;
        this.pickUpPersonAssignedTime = LocalDateTime.now();
        this.pickedUp = 1;
        this.pickedUpTime = LocalDateTime.now();
        this.reachCustomerBranch = 0;
        this.dispatchToVehicle = 0;
        this.reachReceiverBranch = 0;
        this.deliverPersonAssigned = 0;
        this.deliver = 0;
    }

    public TrackDelivery()
    {
        this.TrackCode = UUID.randomUUID().toString();
    }
}
