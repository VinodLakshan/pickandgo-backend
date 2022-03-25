package edu.esoft.sdp.pickAndGoBackend.service;

import edu.esoft.sdp.pickAndGoBackend.model.Schedule;

public interface EmailService
{
    String sendEmail(String to, Schedule schedule);
}
