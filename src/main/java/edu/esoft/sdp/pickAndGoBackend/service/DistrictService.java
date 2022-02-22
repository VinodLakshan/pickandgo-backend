package edu.esoft.sdp.pickAndGoBackend.service;

import edu.esoft.sdp.pickAndGoBackend.model.District;

import java.util.List;

public interface DistrictService {

    List<District> getAllDistricts();

    District getDistrictByID(Integer id);

}
