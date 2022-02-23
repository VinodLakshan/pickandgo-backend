package edu.esoft.sdp.pickAndGoBackend.service;

import edu.esoft.sdp.pickAndGoBackend.model.Receiver;

public interface ReceiverService {

    Receiver createNewReceiver(Receiver receiver);
    Receiver getReceiverById(Long id)throws Exception;
}
