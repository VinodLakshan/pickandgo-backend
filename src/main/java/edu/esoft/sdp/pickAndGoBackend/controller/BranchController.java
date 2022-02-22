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

//    @Autowired
//    private BranchService branchService;
//
//    @PostMapping()
//    public ResponseEntity<Branch> createNewBranch (@RequestBody Branch branch) {
//        log.info("New Branch Has been Created");
//        return new ResponseEntity(new ResponseDto(branchService.createBranch(branch), HttpStatus.OK), HttpStatus.OK);
//
//    }
//
//    @GetMapping()
//    public ResponseEntity<Branch> getAllBranches() {
//        log.info("Retrieving all branch");
//        return new ResponseEntity(new ResponseDto(branchService.getAllBranches(), HttpStatus.OK), HttpStatus.OK);
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Branch> getBranchById(@PathVariable Integer id) throws Exception {
//        return new ResponseEntity(new ResponseDto(branchService.getBranchById(id), HttpStatus.OK), HttpStatus.OK);
//    }
//
//    @GetMapping("/getByDistrictID/{id}")
//    public List<Branch> getAllBranchByDistrictID(@PathVariable Integer id) throws Exception
//    {
//        return branchService.getAllBranches(id);
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Branch> deleteBranch (@PathVariable Integer id) {
//        log.info("A Branch has been Deleted");
//        return new ResponseEntity(new ResponseDto(branchService.deleteBranch(id), HttpStatus.OK), HttpStatus.OK);
//    }

}
