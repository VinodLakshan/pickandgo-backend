package edu.esoft.sdp.pickAndGoBackend.service;

import edu.esoft.sdp.pickAndGoBackend.model.Delivery;
import edu.esoft.sdp.pickAndGoBackend.model.Schedule;

public interface ScheduleService
{
    Schedule createSchedule(Delivery delivery);
}
