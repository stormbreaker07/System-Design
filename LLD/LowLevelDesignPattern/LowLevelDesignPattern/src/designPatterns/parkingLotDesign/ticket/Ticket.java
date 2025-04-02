package designPatterns.parkingLotDesign.ticket;

import java.sql.Timestamp;

public class Ticket {

    private final String ticketId;
    private final String spotId;
    private final String vehicleNumber;
    private final long entryTime;

    public Ticket(String ticketId, String spotId, String vehicleNumber) {
        this.ticketId = ticketId;
        this.spotId = spotId;
        this.vehicleNumber = vehicleNumber;
        this.entryTime = System.currentTimeMillis();
    }

    public String getTicketId() {
        return ticketId;
    }

    public String getSpotId() {
        return spotId;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public long getEntryTime() {
        return entryTime;
    }
}
