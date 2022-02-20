package edu.esoft.sdp.pickAndGoBackend.controller;

import edu.esoft.sdp.pickAndGoBackend.dto.HistoryDto;
import edu.esoft.sdp.pickAndGoBackend.model.Branch;
import edu.esoft.sdp.pickAndGoBackend.model.*;
import edu.esoft.sdp.pickAndGoBackend.service.HistoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/history")
@Slf4j
public class HistoryController {

//    private final HistoryService historyService;
//
//    public HistoryController(HistoryService historyService) {
//        this.historyService = historyService;
//    }

//    @PostMapping
//    public DeliveryStatus getPaymentHistory(@RequestBody HistoryDto historyDto){
//
//        log.info("Saving paddy purchase");
//        Branch branch = new Branch(historyDto.getBranchId());
//        User user = new User(historyDto.getUserId());
//        Payment payment = new Payment(historyDto.getPriceId());
//        PaymentAmount paymentAmount = new PaymentAmount(historyDto.getPaymentAmount());
//
//        return historyService.saveHistory(historyService);
//    }

//    @GetMapping("/{id}")
//    public User getUserById(@PathVariable Integer id) throws Exception {
//        return historyService.getUserById(id);
//    }

}
