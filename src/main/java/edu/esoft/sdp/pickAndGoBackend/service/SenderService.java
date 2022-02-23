package edu.esoft.sdp.pickAndGoBackend.service;

import edu.esoft.sdp.pickAndGoBackend.model.Sender;

public interface SenderService {

    Sender createNewSender(Sender sender);
    Sender getSenderById(Long id) throws Exception;
}
