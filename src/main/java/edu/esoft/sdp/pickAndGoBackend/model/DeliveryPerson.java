package edu.esoft.sdp.pickAndGoBackend.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class DeliveryPerson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long deliveryPersonId;
    private String name;
    private String contactNo;
    private String status;

    @OneToMany(mappedBy = "deliveryPerson")
    private List<Delivery> deliveryList;

    public long getDeliveryPersonId() {
        return deliveryPersonId;
    }

    public void setDeliveryPersonId(long deliveryPersonId) {
        this.deliveryPersonId = deliveryPersonId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Delivery> getDeliveryList() {
        return deliveryList;
    }

    public void setDeliveryList(List<Delivery> deliveryList) {
        this.deliveryList = deliveryList;
    }
}
