package edu.esoft.sdp.pickAndGoBackend.dto;

import edu.esoft.sdp.pickAndGoBackend.model.*;
import lombok.Data;


@Data
public class HistoryDto {

    private Integer senderId;
    private Branch branchId;
    private Payment priceId;
    private Double paymentAmount;
    private String date;
    private String name;
    private Integer status;
    private String role;



}

