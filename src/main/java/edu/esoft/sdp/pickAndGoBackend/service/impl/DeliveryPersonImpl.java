package edu.esoft.sdp.pickAndGoBackend.service.impl;

import edu.esoft.sdp.pickAndGoBackend.model.DeliveryPerson;
import edu.esoft.sdp.pickAndGoBackend.repository.DeliveryPersonRepository;
import edu.esoft.sdp.pickAndGoBackend.service.DeliveryPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryPersonImpl implements DeliveryPersonService {

    @Autowired
    private DeliveryPersonRepository deliveryPersonRepository;

    @Override
    public List<DeliveryPerson> getAllPerson() {
        return  deliveryPersonRepository.findAll();
    }
}
