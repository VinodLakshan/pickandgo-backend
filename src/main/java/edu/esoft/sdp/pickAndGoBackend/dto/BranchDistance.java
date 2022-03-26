package edu.esoft.sdp.pickAndGoBackend.dto;

import edu.esoft.sdp.pickAndGoBackend.model.Branch;

public class BranchDistance {
    private double distance;
    private Branch branch;

    public BranchDistance() {
    }

    public BranchDistance(double distance, Branch branch) {
        this.distance = distance;
        this.branch = branch;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }
}
