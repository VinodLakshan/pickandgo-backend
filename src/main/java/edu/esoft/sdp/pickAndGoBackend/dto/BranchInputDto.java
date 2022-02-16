package edu.esoft.sdp.pickAndGoBackend.dto;

public class BranchInputDto {

    private long branchId;
    private String district;
    private String city;
    private String telephone;
    public BranchInputDto(){

    }

    public BranchInputDto(Integer branchId, String district, String city, String telephone) {

        this.branchId = branchId;
        this.district = district;
        this.city = city;
        this.telephone = telephone;
    }

    public long getBranchId() {
        return branchId;
    }

    public void setBranchId(long branchId) {
        this.branchId = branchId;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

}
