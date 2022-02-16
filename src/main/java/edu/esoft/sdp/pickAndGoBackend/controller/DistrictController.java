package edu.esoft.sdp.pickAndGoBackend.controller;

import edu.esoft.sdp.pickAndGoBackend.dto.ResponseDto;
import edu.esoft.sdp.pickAndGoBackend.service.DistrictService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path="/district")
@Slf4j
public class DistrictController {


//    private DistrictService districtService;
//
//    @GetMapping
//    private ResponseEntity getBranchDetails(@PathVariable Integer id){
//        return new ResponseEntity<>(new ResponseDto(districtService.getDistrictByID(id), HttpStatus.OK), HttpStatus.OK)
//    }
//
//    public ResponseEntity<> getAllDistrict() {
//        return new ResponseEntity<>(new ResponseDto(districtService.getAllDistricts(), HttpStatus.OK), HttpStatus.OK)
//    }


}
