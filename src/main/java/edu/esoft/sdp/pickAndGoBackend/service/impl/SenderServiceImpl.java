package edu.esoft.sdp.pickAndGoBackend.service.impl;

import edu.esoft.sdp.pickAndGoBackend.model.Sender;
import edu.esoft.sdp.pickAndGoBackend.repository.SenderRepository;
import edu.esoft.sdp.pickAndGoBackend.service.SenderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SenderServiceImpl implements SenderService {

    @Autowired
    private SenderRepository senderRepository;

    @Override
    public Sender createNewSender(Sender sender) {
        return this.senderRepository.save(sender);
    }

    @Override
    public Sender getSenderById(Long id) throws Exception{
        return this.senderRepository.findById(id).
                orElseThrow(() -> new Exception("Sender not found for id = " + id));
    }
}
