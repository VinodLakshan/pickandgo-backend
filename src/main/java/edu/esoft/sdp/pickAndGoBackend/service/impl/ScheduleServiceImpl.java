package edu.esoft.sdp.pickAndGoBackend.service.impl;

import edu.esoft.sdp.pickAndGoBackend.common.Common;
import edu.esoft.sdp.pickAndGoBackend.dto.DistanceTime;
import edu.esoft.sdp.pickAndGoBackend.dto.Location;
import edu.esoft.sdp.pickAndGoBackend.model.Delivery;
import edu.esoft.sdp.pickAndGoBackend.model.Schedule;
import edu.esoft.sdp.pickAndGoBackend.repository.ScheduleRepository;
import edu.esoft.sdp.pickAndGoBackend.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ScheduleServiceImpl implements ScheduleService {
    @Autowired
    private ScheduleRepository scheduleRepository;

    @Override
    public Schedule createSchedule(Delivery delivery)
    {
        Location location1 = new Location("7.202396","79.874619");
        Location location2 = new Location("6.934497","79.858435");
        try
        {
            DistanceTime distanceTime = Common.calculateDistance(location1,location2);
            System.out.println(distanceTime.getDistance().getValue());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return null;
    }
}
