package edu.esoft.sdp.pickAndGoBackend.service.impl;

import edu.esoft.sdp.pickAndGoBackend.model.Branch;
import edu.esoft.sdp.pickAndGoBackend.repository.BranchRepository;
import edu.esoft.sdp.pickAndGoBackend.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchServiceImpl implements BranchService {

    @Autowired
    private BranchRepository branchRepository;

    @Override
    public Long getCountOfBranches() {
        return branchRepository.count();
    }

    // TO SAVE A SINGLE BRANCH (POST)
    @Override
    public Branch createBranch(Branch branch) {
        return branchRepository.save(branch);
    }

    // TO FETCH ALL BRANCH OBJECT FROM THE DB (GET)
    @Override
    public List<Branch> getAllBranches() {
        return branchRepository.findAll();
    }

    @Override
    public List<Branch> getAllBranches(Integer branchID) {
        return null;
    }

    // TO FETCH ALL BRANCH OBJECT BY ID FROM THE DB (GET)
    @Override
    public Branch getBranchById(Long id) throws Exception {
        return branchRepository.findById(id).
                orElseThrow(() -> new Exception("Branch not found for id = " + id));
    }

    // TO DELETE A BRANCH (DELETE)
    @Override
    public String deleteBranch(Long id) {
        branchRepository.deleteById(id);
        return "Branch with ID " + id + "Has Been Removed Successfully";
    }

    @Override
    public Branch updateBranch(Branch branch) {
        return null;
    }
}
