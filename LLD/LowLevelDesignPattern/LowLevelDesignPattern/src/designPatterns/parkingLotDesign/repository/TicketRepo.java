package designPatterns.parkingLotDesign.repository;

import designPatterns.parkingLotDesign.ticket.Ticket;

import java.util.ArrayList;
import java.util.List;

public class TicketRepo {

    private static TicketRepo INSTANCE;
    private final List<Ticket> tickets;

    private TicketRepo() {
        this.tickets = new ArrayList<>();
    }

    public static TicketRepo getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new TicketRepo();
        }
        return INSTANCE;
    }

    public List<Ticket> getTicketsList() {
        return tickets;
    }
}
