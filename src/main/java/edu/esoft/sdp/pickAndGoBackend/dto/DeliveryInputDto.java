package edu.esoft.sdp.pickAndGoBackend.dto;

import edu.esoft.sdp.pickAndGoBackend.model.*;

import java.util.List;

public class DeliveryInputDto {

    private long deliveryId;
    private String scheduledPickupAt;
    private String date;

    private String pickUpLongitute;
    private String pickupLatitute;

    private String scheduledDeliverAt;
    private String deliverLongitute;
    private String deliverLatitute;

    private double totalAmount;
    private User user;

    private Receiver receiver;

    private Sender sender;

    private Payment payment;

    private Branch pickupBranch;

    private Branch destinationBranch;

    private List<DeliveryDetails> deliveryDetails;

    private Vehicle vehicle;

    private List<Item> items;


    public DeliveryInputDto(){

    }

    public DeliveryInputDto(long deliveryId, String scheduledPickupAt, String date, String pickUpLongitute,
                            String pickupLatitute, String scheduledDeliverAt, String deliverLongitute,
                            String deliverLatitute, double totalAmount, User user, Receiver receiver,
                            Sender sender, Payment payment, Branch pickupBranch, Branch destinationBranch,
                            List<DeliveryDetails> deliveryDetails, Vehicle vehicle, List<Item> items) {
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
        this.deliveryDetails = deliveryDetails;
        this.vehicle = vehicle;
        this.items = items;
    }

    public long getDeliveryId() { return deliveryId; }

    public void setDeliveryId(long deliveryId) { this.deliveryId = deliveryId; }

    public String getScheduledPickupAt() { return scheduledPickupAt; }

    public void setScheduledPickupAt(String scheduledPickupAt) { this.scheduledPickupAt = scheduledPickupAt; }

    public String getDate() { return date; }

    public void setDate(String date) { this.date = date; }

    public String getPickUpLongitute() { return pickUpLongitute; }

    public void setPickUpLongitute(String pickUpLongitute) { this.pickUpLongitute = pickUpLongitute; }

    public String getPickupLatitute() { return pickupLatitute; }

    public void setPickupLatitute(String pickupLatitute) { this.pickupLatitute = pickupLatitute; }

    public String getScheduledDeliverAt() { return scheduledDeliverAt; }

    public void setScheduledDeliverAt(String scheduledDeliverAt) { this.scheduledDeliverAt = scheduledDeliverAt; }

    public String getDeliverLongitute() { return deliverLongitute; }

    public void setDeliverLongitute(String deliverLongitute) { this.deliverLongitute = deliverLongitute; }

    public String getDeliverLatitute() { return deliverLatitute; }

    public void setDeliverLatitute(String deliverLatitute) { this.deliverLatitute = deliverLatitute; }

    public double getTotalAmount() { return totalAmount; }

    public void setTotalAmount(double totalAmount) { this.totalAmount = totalAmount; }

    public User getUser() { return user; }

    public void setUser(User user) { this.user = user; }

    public Receiver getReceiver() { return receiver; }

    public void setReceiver(Receiver receiver) { this.receiver = receiver; }

    public Sender getSender() { return sender; }

    public void setSender(Sender sender) { this.sender = sender; }

    public Payment getPayment() { return payment; }

    public void setPayment(Payment payment) { this.payment = payment; }

    public Branch getPickupBranch() { return pickupBranch; }

    public void setPickupBranch(Branch pickupBranch) { this.pickupBranch = pickupBranch; }

    public Branch getDestinationBranch() { return destinationBranch; }

    public void setDestinationBranch(Branch destinationBranch) { this.destinationBranch = destinationBranch; }

    public List<DeliveryDetails> getDeliveryDetails() { return deliveryDetails; }

    public void setDeliveryDetails(List<DeliveryDetails> deliveryDetails) { this.deliveryDetails = deliveryDetails; }

    public Vehicle getVehicle() { return vehicle; }

    public void setVehicle(Vehicle vehicle) { this.vehicle = vehicle; }

    public List<Item> getItems() { return items; }

    public void setItems(List<Item> items) { this.items = items; }
}
