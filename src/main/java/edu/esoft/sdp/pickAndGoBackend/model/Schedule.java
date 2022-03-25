package edu.esoft.sdp.pickAndGoBackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Schedule implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @OneToOne
    private Delivery delivery;

    private String pickUp;
    private String reachCustomerBranch;
    private String dispatchToVehicle;
    private String reachReceiverBranch;
    private String deliver;
    private double totalDistance;
}
