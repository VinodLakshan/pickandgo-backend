package edu.esoft.sdp.pickAndGoBackend.controller;

import edu.esoft.sdp.pickAndGoBackend.dto.BranchInputDto;

import edu.esoft.sdp.pickAndGoBackend.dto.ResponseDto;
import edu.esoft.sdp.pickAndGoBackend.model.Branch;
import edu.esoft.sdp.pickAndGoBackend.service.BranchService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path="/branch")
@Slf4j
public class BranchController {

    @Autowired
    private BranchService branchService;

    @PostMapping()
    public Branch createNewBranch (@RequestBody Branch branch) {
        log.info("New Branch Has been Created");
        return branchService.createBranch(branch);

    }

    @GetMapping()
    public List<Branch> getAllBranches() {
        log.info("Retrieving all branch");
        return branchService.getAllBranches();
    }

    @GetMapping("/{id}")
    public Branch getBranchById(@PathVariable Integer id) throws Exception {
        return branchService.getBranchById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteBranch (@PathVariable Integer id) {
        log.info("A Branch has been Deleted");
        return branchService.deleteBranch(id);
    }

}
