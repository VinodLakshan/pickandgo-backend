package edu.esoft.sdp.pickAndGoBackend.model;

import javax.persistence.*;

@Entity
public class DeliveryDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long deliveryDetailsId;
    private String dateTime;

    private String description;

    @ManyToOne
    private DeliveryStatus deliveryStatus;

    @ManyToOne
    private Delivery delivery;

    public DeliveryDetails() {
    }

    public DeliveryDetails(long deliveryDetailsId, String dateTime, String description, DeliveryStatus deliveryStatus, Delivery delivery) {
        this.deliveryDetailsId = deliveryDetailsId;
        this.dateTime = dateTime;
        this.description = description;
        this.deliveryStatus = deliveryStatus;
        this.delivery = delivery;
    }

    public long getDeliveryDetailsId() {
        return deliveryDetailsId;
    }

    public void setDeliveryDetailsId(long deliveryDetailsId) {
        this.deliveryDetailsId = deliveryDetailsId;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public DeliveryStatus getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(DeliveryStatus deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public Delivery getDelivery() { return delivery; }

    public void setDelivery(Delivery delivery) { this.delivery = delivery; }
}
