package designPatterns.parkingLotDesign.parkingLot;

import designPatterns.parkingLotDesign.enums.VehicleType;
import designPatterns.parkingLotDesign.parkingFloor.ParkingFloor;
import designPatterns.parkingLotDesign.parkingSpot.ParkingSpot;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ParkingLot {

    private final List<ParkingFloor> floors;

    public ParkingLot() {
        this.floors = new ArrayList<>();
    }

    public void addParkingSpot(String spotId, VehicleType vehicleType, String floorId) throws Exception {
        ParkingFloor currFloor = floors
                        .stream()
                        .filter(floor -> floor.getFloorId().equals(floorId))
                        .findFirst()
                        .orElseThrow(() -> new Exception("no floor for this id"));

        currFloor.addParkingSpot(spotId, vehicleType);
    }

    public void addParkingFloor(String floorId) {
        ParkingFloor floor = new ParkingFloor(floorId);
        floors.add(floor);
    }

    public ParkingSpot getNextVacantSpot(VehicleType vehicleType) throws Exception {
        for(ParkingFloor floor : floors) {
            try {
                return floor.getNextVacantSpot(vehicleType);
            } catch (Exception e) {
                System.out.println("No parking spot vacant on floor " + floor.getFloorId());
            }
        }
        throw new Exception("The Whole parking is full");
    }

    public ParkingSpot getRequiredParkingSpot(String spotId) throws Exception {
        for(ParkingFloor floor : floors) {
            Optional<ParkingSpot> spot = floor.getRequiredSpot(spotId);
            if(spot.isPresent())
                return spot.get();
        }
        throw new Exception("NO spot for this spot id is present in the parking lot");
    }
}
