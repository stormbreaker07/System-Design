package designPatterns.parkingLotDesign.gate;

import designPatterns.parkingLotDesign.parkingLot.ParkingLot;
import designPatterns.parkingLotDesign.parkingSpot.ParkingSpot;
import designPatterns.parkingLotDesign.repository.TicketRepo;
import designPatterns.parkingLotDesign.ticket.Ticket;
import designPatterns.parkingLotDesign.vehicle.VehicleInterface;

import java.util.Optional;

public class ExitGateKeeper {

    private final ParkingLot parkingLot;

    public ExitGateKeeper(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public double vehicleOnExitGate(VehicleInterface vehicle) throws Exception {
        Ticket assignedTicket = TicketRepo.getInstance().getTicketsList()
                .stream()
                .filter(ticket -> ticket.getVehicleNumber().equals(vehicle.getVehicleNumber()))
                .findFirst()
                .orElseThrow(() -> new Exception("No ticket on this Vehicle"));

        ParkingSpot spot = parkingLot.getRequiredParkingSpot(assignedTicket.getSpotId());
        spot.vacantSpot();
        return calculateParkingPrice(assignedTicket.getEntryTime());
    }

    private double calculateParkingPrice(long entryTime) {
        double totalParkedTime = System.currentTimeMillis() - entryTime;
        double totalTimeInHours = Math.ceil(totalParkedTime /(100*60*60));
        //2 dollar per hour parking
        return totalTimeInHours*2;
    }
}
