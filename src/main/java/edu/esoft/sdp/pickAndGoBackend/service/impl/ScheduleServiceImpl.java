package edu.esoft.sdp.pickAndGoBackend.service.impl;

import edu.esoft.sdp.pickAndGoBackend.common.Common;
import edu.esoft.sdp.pickAndGoBackend.dto.DistanceTime;
import edu.esoft.sdp.pickAndGoBackend.dto.Location;
import edu.esoft.sdp.pickAndGoBackend.model.Delivery;
import edu.esoft.sdp.pickAndGoBackend.model.Schedule;
import edu.esoft.sdp.pickAndGoBackend.repository.DeliveryRepository;
import edu.esoft.sdp.pickAndGoBackend.repository.ScheduleRepository;
import edu.esoft.sdp.pickAndGoBackend.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Service
public class ScheduleServiceImpl implements ScheduleService
{
    private LocalDateTime date;
    private long TimeCount;

    @Autowired
    private DeliveryRepository deliveryRepository;

    @Autowired
    private ScheduleRepository scheduleRepository;

    @Override
    public Schedule createSchedule(Delivery delivery)
    {
        String customerBranch = "colombo";
        String receiverBranch = "gampaha";
        Location customerBranchLocation = new Location("7.202396","79.874619");
        Location receiverBranchLocation = new Location("6.934497","79.858435");
        Location customerLocation = new Location("6.954772","79.866739");
        Location receiverLocation = new Location("7.063194","79.899770");
        date = LocalDateTime.now();

        TimeCount = 60*60*date.getHour() + 60*date.getMinute();
//        long TotalTimeCount = 0;
        Schedule schedule = new Schedule();
//        LocalDate currDate = date.toLocalDate();

        try
        {
            schedule.setDelivery(delivery);
            DistanceTime Pickup = Common.calculateDistance(customerBranchLocation, customerLocation);
            DistanceTime CLocationToCBranch = Common.calculateDistance(customerLocation, customerBranchLocation);
            DistanceTime CBranchToRBranch = Common.calculateDistance(customerBranchLocation, receiverBranchLocation);
            DistanceTime RBranchToRLocation = Common.calculateDistance(receiverBranchLocation, receiverLocation);

//            System.out.println(CBranchToRBranch.getTime().getText());
//            System.out.println(CLocationToCBranch.getTime());
            schedule.setPickUp(findDateTime(Pickup));
            schedule.setReachCustomerBranch(findDateTime(CLocationToCBranch));

            if(date.getHour()>17)
            {
                date = date.plusDays(1);
            }
            date = date.toLocalDate().atTime(19,0);
            TimeCount = 19*60*60;
            schedule.setDispatchToVehicle(date.toLocalDate() + " " + date.getHour() + ":" + date.getMinute());
            schedule.setReachReceiverBranch(findDateTime(CBranchToRBranch));
            schedule.setDeliver(findDateTime(RBranchToRLocation));

//            System.out.println(schedule.getPickUp());
//            System.out.println(schedule.getReachCustomerBranch());
//            System.out.println(schedule.getDispatchToVehicle());
//            System.out.println(schedule.getReachReceiverBranch());
//            System.out.println(schedule.getDeliver());
            schedule.setTotalDistance(Pickup.getDistance().getValue() + CLocationToCBranch.getDistance().getValue() + CBranchToRBranch.getDistance().getValue() + RBranchToRLocation.getDistance().getValue());
//            deliveryRepository.save(delivery);
            return (schedule);

        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }


    public String findDateTime(DistanceTime distanceTime)
    {
//        System.out.println(TimeCount);
//        System.out.println(date.toString());
        if(TimeCount + distanceTime.getTime().getValue() < 86400)
        {
            TimeCount += distanceTime.getTime().getValue();
        }
        else
        {
            date = date.plusDays(1);
            TimeCount += distanceTime.getTime().getValue() - 86400;
        }
//        System.out.println(date.toString());
//        System.out.println(TimeCount);

        if(distanceTime.getTime().getValue() < 3600)
        {
            date = date.plusHours(1);
        }
        else
        {
            date = date.plusHours(distanceTime.getTime().getValue()/3600);
            date = date.plusMinutes((distanceTime.getTime().getValue()%3600)/60);
        }

        return(date.toLocalDate() + " " + date.getHour() + ":" + date.getMinute());
    }
}
