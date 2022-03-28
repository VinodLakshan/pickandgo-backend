package edu.esoft.sdp.pickAndGoBackend.repository;

import edu.esoft.sdp.pickAndGoBackend.model.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeliveryRepository extends JpaRepository<Delivery, Long> {

    @Query(value = "select * from track_delivery TD inner join delivery D on TD.delivery_delivery_id=D.delivery_id where TD.reach_customer_branch==0 and D.pickup_branch_branch_id==:branchId;",nativeQuery = true)
    List<?> findAllGoodsNotReachedCusBranch(@Param("branchId") int branchId );

    @Query(value = "select * from track_delivery TD inner join delivery D on TD.delivery_delivery_id = D.delivery_id where TD.reach_customer_branch = 1 and TD.dispatch_to_vehicle = 0 and D.vehicle_vehicle_id = null and D.pickup_branch_branch_id = :branchId;",nativeQuery = true)
    List<?> findAllGoodsNotLoadedToVehicle(@Param("branchId") int branchId );

}
