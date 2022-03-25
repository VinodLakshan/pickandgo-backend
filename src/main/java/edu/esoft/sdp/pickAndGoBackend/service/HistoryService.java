package edu.esoft.sdp.pickAndGoBackend.service;

import edu.esoft.sdp.pickAndGoBackend.dto.HistoryDto;
import edu.esoft.sdp.pickAndGoBackend.model.DeliveryStatus;
import edu.esoft.sdp.pickAndGoBackend.model.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface HistoryService {

    List<HistoryDto> viewHistoryReport();

}
