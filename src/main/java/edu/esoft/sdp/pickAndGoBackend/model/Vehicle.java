package edu.esoft.sdp.pickAndGoBackend.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer vehicleId;
    private String type;
    private String vehicleNo;
    private String status;

    @OneToMany(mappedBy = "vehicle")
    private List<Delivery> currentDeliveries;

    public Vehicle() {
    }

    public Integer getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Delivery> getCurrentDeliveries() {
        return currentDeliveries;
    }

    public void setCurrentDeliveries(List<Delivery> currentDeliveries) {
        this.currentDeliveries = currentDeliveries;
    }
}
