package edu.esoft.sdp.pickAndGoBackend.service.impl;

import edu.esoft.sdp.pickAndGoBackend.model.District;
import edu.esoft.sdp.pickAndGoBackend.repository.DistrictRepository;
import edu.esoft.sdp.pickAndGoBackend.service.BranchService;
import edu.esoft.sdp.pickAndGoBackend.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictServiceImpl implements DistrictService {

    @Autowired
    private final DistrictRepository districtRepository;


    public DistrictServiceImpl(DistrictRepository districtRepository) {
        this.districtRepository = districtRepository;
    }


    @Override
    public List<District> getAllDistricts() {
        return districtRepository.findAll();
    }

    @Override
    public District getDistrictByID(Integer id) {
        return districtRepository.findById(id).orElse(null);
    }
}
