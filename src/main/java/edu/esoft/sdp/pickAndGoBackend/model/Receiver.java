package edu.esoft.sdp.pickAndGoBackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Receiver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long recieverId;
    private String name;
    private String mobileNo;
    private String address;

    public Receiver() {
    }

    public long getRecieverId() { return recieverId; }

    public void setRecieverId(long recieverId) { this.recieverId = recieverId; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
