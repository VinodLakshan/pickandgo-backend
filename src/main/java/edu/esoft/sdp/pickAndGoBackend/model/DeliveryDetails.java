package edu.esoft.sdp.pickAndGoBackend.model;

import javax.persistence.*;

@Entity
public class DeliveryDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long deliveryDetailsId;
    private String dateTime;

    @ManyToOne
    private DeliveryStatus deliveryStatus;

    public DeliveryDetails() {
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
}
