package designPatterns.parkingLotDesign.gate;

import designPatterns.parkingLotDesign.enums.VehicleType;
import designPatterns.parkingLotDesign.parkingFloor.ParkingFloor;
import designPatterns.parkingLotDesign.parkingLot.ParkingLot;
import designPatterns.parkingLotDesign.parkingSpot.ParkingSpot;
import designPatterns.parkingLotDesign.repository.TicketRepo;
import designPatterns.parkingLotDesign.ticket.Ticket;
import designPatterns.parkingLotDesign.vehicle.VehicleInterface;

import java.util.ArrayList;
import java.util.List;

public class EntryGateKeeper {

    //list of ticket
    //last ticket id
    //vehicle came it will record it vehicle type and number , check if any vacant spot
    //for it, if get one then make a ticket, assign the spot, get current time in miliseconds,

    private long currTicketId;
    private final ParkingLot parkingLot;

    public EntryGateKeeper(ParkingLot parkingLot) {
        this.currTicketId = 0;
        this.parkingLot = parkingLot;
    }

    public void vehicleOnGate(VehicleInterface vehicle) {

        try {
            ParkingSpot vacantSpot = parkingLot.getNextVacantSpot(vehicle.getVehicleType());
            //make ticket
            Ticket currTicket = new Ticket(String.valueOf(currTicketId),
                    vacantSpot.getSpotId(), vehicle.getVehicleNumber());
            vacantSpot.assignVehicle(vehicle);
            TicketRepo.getInstance().getTicketsList().add(currTicket);
            this.currTicketId++;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
