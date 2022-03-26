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
    private String TrackCode;
    @ManyToOne
    private DeliveryPerson pickUpPersonAssigned;
    private LocalDateTime pickUpPersonAssignedTime;
    private int pickedUp = 0;
    private LocalDateTime pickedUpTime;
    private int reachCustomerBranch = 0;
    private LocalDateTime reachCustomerBranchTime;
    private int dispatchToVehicle;
    private LocalDateTime dispatchToVehicleTime;
    private int reachReceiverBranch = 0;
    private LocalDateTime reachReceiverBranchTime;
    @ManyToOne
    private DeliveryPerson deliverPersonAssigned;
    private LocalDateTime deliverPersonAssignedTime;
    private int deliver =0;
    private LocalDateTime deliverTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTrackCode() {
        return TrackCode;
    }

    public void setTrackCode(String trackCode) {
        TrackCode = trackCode;
    }

    public DeliveryPerson getPickUpPersonAssigned() {
        return pickUpPersonAssigned;
    }

    public void setPickUpPersonAssigned(DeliveryPerson pickUpPersonAssigned) {
        this.pickUpPersonAssigned = pickUpPersonAssigned;
    }

    public LocalDateTime getPickUpPersonAssignedTime() {
        return pickUpPersonAssignedTime;
    }

    public void setPickUpPersonAssignedTime(LocalDateTime pickUpPersonAssignedTime) {
        this.pickUpPersonAssignedTime = pickUpPersonAssignedTime;
    }

    public int getPickedUp() {
        return pickedUp;
    }

    public void setPickedUp(int pickedUp) {
        this.pickedUp = pickedUp;
    }

    public LocalDateTime getPickedUpTime() {
        return pickedUpTime;
    }

    public void setPickedUpTime(LocalDateTime pickedUpTime) {
        this.pickedUpTime = pickedUpTime;
    }

    public int getReachCustomerBranch() {
        return reachCustomerBranch;
    }

    public void setReachCustomerBranch(int reachCustomerBranch) {
        this.reachCustomerBranch = reachCustomerBranch;
    }

    public LocalDateTime getReachCustomerBranchTime() {
        return reachCustomerBranchTime;
    }

    public void setReachCustomerBranchTime(LocalDateTime reachCustomerBranchTime) {
        this.reachCustomerBranchTime = reachCustomerBranchTime;
    }

    public int getDispatchToVehicle() {
        return dispatchToVehicle;
    }

    public void setDispatchToVehicle(int dispatchToVehicle) {
        this.dispatchToVehicle = dispatchToVehicle;
    }

    public LocalDateTime getDispatchToVehicleTime() {
        return dispatchToVehicleTime;
    }

    public void setDispatchToVehicleTime(LocalDateTime dispatchToVehicleTime) {
        this.dispatchToVehicleTime = dispatchToVehicleTime;
    }

    public int getReachReceiverBranch() {
        return reachReceiverBranch;
    }

    public void setReachReceiverBranch(int reachReceiverBranch) {
        this.reachReceiverBranch = reachReceiverBranch;
    }

    public LocalDateTime getReachReceiverBranchTime() {
        return reachReceiverBranchTime;
    }

    public void setReachReceiverBranchTime(LocalDateTime reachReceiverBranchTime) {
        this.reachReceiverBranchTime = reachReceiverBranchTime;
    }

    public DeliveryPerson getDeliverPersonAssigned() {
        return deliverPersonAssigned;
    }

    public void setDeliverPersonAssigned(DeliveryPerson deliverPersonAssigned) {
        this.deliverPersonAssigned = deliverPersonAssigned;
    }

    public LocalDateTime getDeliverPersonAssignedTime() {
        return deliverPersonAssignedTime;
    }

    public void setDeliverPersonAssignedTime(LocalDateTime deliverPersonAssignedTime) {
        this.deliverPersonAssignedTime = deliverPersonAssignedTime;
    }

    public int getDeliver() {
        return deliver;
    }

    public void setDeliver(int deliver) {
        this.deliver = deliver;
    }

    public LocalDateTime getDeliverTime() {
        return deliverTime;
    }

    public void setDeliverTime(LocalDateTime deliverTime) {
        this.deliverTime = deliverTime;
    }

    public TrackDelivery()
    {
        this.TrackCode = UUID.randomUUID().toString();
    }
}
