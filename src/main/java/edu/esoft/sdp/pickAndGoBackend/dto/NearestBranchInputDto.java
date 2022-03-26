package edu.esoft.sdp.pickAndGoBackend.dto;

public class NearestBranchInputDto {
    private String pickUpLat;
    private String pickUpLng;
    private String dropOffLat;
    private String dropOffLng;

    public String getPickUpLat() {
        return pickUpLat;
    }

    public void setPickUpLat(String pickUpLat) {
        this.pickUpLat = pickUpLat;
    }

    public String getPickUpLng() {
        return pickUpLng;
    }

    public void setPickUpLng(String pickUpLng) {
        this.pickUpLng = pickUpLng;
    }

    public String getDropOffLat() {
        return dropOffLat;
    }

    public void setDropOffLat(String dropOffLat) {
        this.dropOffLat = dropOffLat;
    }

    public String getDropOffLng() {
        return dropOffLng;
    }

    public void setDropOffLng(String dropOffLng) {
        this.dropOffLng = dropOffLng;
    }
}
