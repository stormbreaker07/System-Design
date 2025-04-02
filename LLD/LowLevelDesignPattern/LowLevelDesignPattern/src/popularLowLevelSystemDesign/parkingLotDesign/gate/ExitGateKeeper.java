package popularLowLevelSystemDesign.parkingLotDesign.gate;

import popularLowLevelSystemDesign.parkingLotDesign.parkingLot.ParkingLot;
import popularLowLevelSystemDesign.parkingLotDesign.parkingSpot.ParkingSpot;
import popularLowLevelSystemDesign.parkingLotDesign.repository.TicketRepo;
import popularLowLevelSystemDesign.parkingLotDesign.ticket.Ticket;
import popularLowLevelSystemDesign.parkingLotDesign.vehicle.VehicleInterface;

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
