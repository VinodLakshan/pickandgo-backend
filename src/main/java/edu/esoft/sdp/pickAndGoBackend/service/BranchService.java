package edu.esoft.sdp.pickAndGoBackend.service;

import edu.esoft.sdp.pickAndGoBackend.model.Branch;

import java.util.List;

public interface BranchService {

    Long getCountOfBranches();

    Branch createBranch(Branch branch);

    List<Branch> getAllBranches();

    List<Branch> getAllBranches(Integer branchID);

    Branch getBranchById(Long id) throws Exception;

    String deleteBranch(Long id);

    Branch updateBranch(Branch branch);

    //    List<Branch> getAllBranch(Integer id);
}
