package edu.esoft.sdp.pickAndGoBackend.controller;

import edu.esoft.sdp.pickAndGoBackend.dto.HistoryDto;
import edu.esoft.sdp.pickAndGoBackend.model.Branch;
import edu.esoft.sdp.pickAndGoBackend.model.*;
import edu.esoft.sdp.pickAndGoBackend.service.HistoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/history")
@Slf4j
public class HistoryController {

    private HistoryService historyService;

    public HistoryController(HistoryService historyService){
        this.historyService= historyService;
    }

    @GetMapping()
    public @ResponseBody List<HistoryDto> viewHistoryReport() {
        return historyService.viewHistoryReport();
    }

}
