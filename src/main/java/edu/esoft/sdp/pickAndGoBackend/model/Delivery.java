package edu.esoft.sdp.pickAndGoBackend.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long deliveryId;
    private String scheduledPickupAt;
    private String scheduledDeliverAt;
    private double totalAmount;

    @ManyToOne
    private User sender;

    @OneToOne
    private Receiver receiver;

    @OneToOne
    private Payment payment;

    @ManyToOne
    private Branch pickupBranch;

    @ManyToOne
    private Branch destinationBranch;

    @OneToMany(cascade = CascadeType.ALL)
    private List<DeliveryDetails> deliveryDetails;

    @ManyToOne
    private Vehicle vehicle;

    public Delivery() {
    }

    public long getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(long deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getScheduledPickupAt() {
        return scheduledPickupAt;
    }

    public void setScheduledPickupAt(String scheduledPickupAt) {
        this.scheduledPickupAt = scheduledPickupAt;
    }

    public String getScheduledDeliverAt() {
        return scheduledDeliverAt;
    }

    public void setScheduledDeliverAt(String scheduledDeliverAt) {
        this.scheduledDeliverAt = scheduledDeliverAt;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Branch getPickupBranch() {
        return pickupBranch;
    }

    public void setPickupBranch(Branch pickupBranch) {
        this.pickupBranch = pickupBranch;
    }

    public Branch getDestinationBranch() {
        return destinationBranch;
    }

    public void setDestinationBranch(Branch destinationBranch) {
        this.destinationBranch = destinationBranch;
    }

    public List<DeliveryDetails> getDeliveryDetails() {
        return deliveryDetails;
    }

    public void setDeliveryDetails(List<DeliveryDetails> deliveryDetails) {
        this.deliveryDetails = deliveryDetails;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
