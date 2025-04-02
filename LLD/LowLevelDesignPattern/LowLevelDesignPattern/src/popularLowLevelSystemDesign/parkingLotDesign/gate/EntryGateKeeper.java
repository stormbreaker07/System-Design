package popularLowLevelSystemDesign.parkingLotDesign.gate;

import popularLowLevelSystemDesign.parkingLotDesign.parkingLot.ParkingLot;
import popularLowLevelSystemDesign.parkingLotDesign.parkingSpot.ParkingSpot;
import popularLowLevelSystemDesign.parkingLotDesign.repository.TicketRepo;
import popularLowLevelSystemDesign.parkingLotDesign.ticket.Ticket;
import popularLowLevelSystemDesign.parkingLotDesign.vehicle.VehicleInterface;

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
