package edu.esoft.sdp.pickAndGoBackend.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long deliveryId;
    private String scheduledPickupAt;
    private String date;

    private String pickUpLongitute;
    private String pickupLatitute;

    private String scheduledDeliverAt;
    private String deliverLongitute;
    private String deliverLatitute;

    private double totalAmount;

    @ManyToOne
    private User user;

    @OneToOne
    private Receiver receiver;

    @OneToOne
    private TrackDelivery trackDelivery;

    @OneToOne
    private Sender sender;

    @OneToOne
    private Payment payment;

    @ManyToOne
    private Branch pickupBranch;

    @ManyToOne
    private Branch destinationBranch;

//    @OneToMany(cascade = CascadeType.ALL)
//    private List<DeliveryDetails> deliveryDetails;

    @ManyToOne
    private Vehicle vehicle;

    public Delivery() {
    }

    public Delivery(long deliveryId, String scheduledPickupAt, String date, String pickUpLongitute,
                    String pickupLatitute, String scheduledDeliverAt, String deliverLongitute, String deliverLatitute,
                    double totalAmount, User user, Receiver receiver, Sender sender, Payment payment,
                    Branch pickupBranch, Branch destinationBranch, Vehicle vehicle) {
        this.deliveryId = deliveryId;
        this.scheduledPickupAt = scheduledPickupAt;
        this.date = date;
        this.pickUpLongitute = pickUpLongitute;
        this.pickupLatitute = pickupLatitute;
        this.scheduledDeliverAt = scheduledDeliverAt;
        this.deliverLongitute = deliverLongitute;
        this.deliverLatitute = deliverLatitute;
        this.totalAmount = totalAmount;
        this.user = user;
        this.receiver = receiver;
        this.sender = sender;
        this.payment = payment;
        this.pickupBranch = pickupBranch;
        this.destinationBranch = destinationBranch;
        this.vehicle = vehicle;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Sender getSender() { return sender; }

    public void setSender(Sender sender) { this.sender = sender; }

    public String getPickUpLongitute() { return pickUpLongitute; }

    public void setPickUpLongitute(String pickUpLongitute) { this.pickUpLongitute = pickUpLongitute; }

    public String getPickupLatitute() { return pickupLatitute; }

    public void setPickupLatitute(String pickupLatitute) { this.pickupLatitute = pickupLatitute; }

    public String getDeliverLongitute() { return deliverLongitute; }

    public void setDeliverLongitute(String deliverLongitute) { this.deliverLongitute = deliverLongitute; }

    public String getDeliverLatitute() { return deliverLatitute; }

    public void setDeliverLatitute(String deliverLatitute) { this.deliverLatitute = deliverLatitute; }

    public String getDate() { return date; }

    public void setDate(String date) { this.date = date; }

    public TrackDelivery getTrackDelivery() {
        return trackDelivery;
    }

    public void setTrackDelivery(TrackDelivery trackDelivery) {
        this.trackDelivery = trackDelivery;
    }
}