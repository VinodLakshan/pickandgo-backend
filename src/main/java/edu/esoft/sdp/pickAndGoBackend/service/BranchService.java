package edu.esoft.sdp.pickAndGoBackend.service;

import edu.esoft.sdp.pickAndGoBackend.model.Branch;

import java.util.List;

public interface BranchService {

    Long getCountOfBranches();

    Branch createBranch(Branch branch);

    List<Branch> getAllBranches();

    List<Branch> getAllBranches(Integer branchID);

    Branch getBranchById(Integer id) throws Exception;

    String deleteBranch(Integer id);

    Branch updateBranch(Branch branch);

    //    List<Branch> getAllBranch(Integer id);
}
