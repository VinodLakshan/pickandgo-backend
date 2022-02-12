package edu.esoft.sdp.pickAndGoBackend.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class DeliveryStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long deliveryStatusId;
    private String status;

    @OneToMany(mappedBy = "deliveryStatus")
    private List<DeliveryDetails> deliveryDetailsList;

    public DeliveryStatus() {
    }

    public long getDeliveryStatusId() {
        return deliveryStatusId;
    }

    public void setDeliveryStatusId(long deliveryStatusId) {
        this.deliveryStatusId = deliveryStatusId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<DeliveryDetails> getDeliveryDetailsList() {
        return deliveryDetailsList;
    }

    public void setDeliveryDetailsList(List<DeliveryDetails> deliveryDetailsList) {
        this.deliveryDetailsList = deliveryDetailsList;
    }
}
