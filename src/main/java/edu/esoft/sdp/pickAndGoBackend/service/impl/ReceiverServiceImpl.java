package edu.esoft.sdp.pickAndGoBackend.service.impl;

import edu.esoft.sdp.pickAndGoBackend.model.Receiver;
import edu.esoft.sdp.pickAndGoBackend.repository.ReceiverRepository;
import edu.esoft.sdp.pickAndGoBackend.service.ReceiverService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ReceiverServiceImpl implements ReceiverService {

    @Autowired
    private ReceiverRepository receiverRepository;

    @Override
    public Receiver createNewReceiver(Receiver receiver) {
        return this.receiverRepository.save(receiver);
    }

    @Override
    public Receiver getReceiverById(Long id) throws Exception{
        return this.receiverRepository.findById(id).
                orElseThrow(() -> new Exception("Reciever not found for id = " + id));
    }
}
