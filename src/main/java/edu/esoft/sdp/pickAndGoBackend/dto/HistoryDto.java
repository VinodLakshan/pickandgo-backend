package edu.esoft.sdp.pickAndGoBackend.dto;

import edu.esoft.sdp.pickAndGoBackend.model.*;

public class HistoryDto {

    private Sender senderId;
    private Branch branchId;
    private Payment priceId;
    private Double paymentAmount;
    private String date;
    private String name;
    private DeliveryStatus status;
    private String role;

    public HistoryDto(Sender senderId, Branch branchId, Payment priceId, Double paymentAmount, String dateTime, String name, DeliveryStatus deliveryStatus, String role) {
        this.senderId = senderId;
        this.branchId = branchId;
        this.priceId = priceId;
        this.paymentAmount = paymentAmount;
        this.date = dateTime;
        this.name = name;
        this.status = deliveryStatus;
        this.role = role;
    }

    public HistoryDto(String dateTime, DeliveryStatus deliveryStatus) {
        this.status = deliveryStatus;
        this.date = dateTime;
    }

    public Sender getSenderId() {
        return senderId;
    }

    public void setSenderId(Sender senderId) {
        this.senderId = senderId;
    }

    public Branch getBranchId() {
        return branchId;
    }

    public void setBranchId(Branch branchId) {
        this.branchId = branchId;
    }

    public Payment getPriceId() {
        return priceId;
    }

    public void setPriceId(Payment priceId) {
        this.priceId = priceId;
    }

    public Double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeliveryStatus getDeliveryStatus() {
        return status;
    }

    public void setDeliveryStatus(DeliveryStatus deliveryStatus) {
        this.status = status;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

