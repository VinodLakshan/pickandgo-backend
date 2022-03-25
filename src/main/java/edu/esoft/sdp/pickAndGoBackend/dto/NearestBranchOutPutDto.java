package edu.esoft.sdp.pickAndGoBackend.dto;

import edu.esoft.sdp.pickAndGoBackend.model.Branch;

public class NearestBranchOutPutDto {
    private Branch pickUpNearestBranch;
    private Branch dropOffNearestBranch;

    public NearestBranchOutPutDto() {
    }

    public NearestBranchOutPutDto(Branch pickUpNearestBranch, Branch dropOffNearestBranch) {
        this.pickUpNearestBranch = pickUpNearestBranch;
        this.dropOffNearestBranch = dropOffNearestBranch;
    }

    public Branch getPickUpNearestBranch() {
        return pickUpNearestBranch;
    }

    public void setPickUpNearestBranch(Branch pickUpNearestBranch) {
        this.pickUpNearestBranch = pickUpNearestBranch;
    }

    public Branch getDropOffNearestBranch() {
        return dropOffNearestBranch;
    }

    public void setDropOffNearestBranch(Branch dropOffNearestBranch) {
        this.dropOffNearestBranch = dropOffNearestBranch;
    }
}
