package edu.esoft.sdp.pickAndGoBackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DistanceTime
{
    private TextValue distance;
    private TextValue time;

    public TextValue getDistance() {
        return distance;
    }

    public void setDistance(TextValue distance) {
        this.distance = distance;
    }

    public TextValue getTime() {
        return time;
    }

    public void setTime(TextValue time) {
        this.time = time;
    }
}