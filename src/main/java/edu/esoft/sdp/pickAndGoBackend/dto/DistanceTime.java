package edu.esoft.sdp.pickAndGoBackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DistanceTime
{
    private TextValue distance;
    private TextValue time;
}