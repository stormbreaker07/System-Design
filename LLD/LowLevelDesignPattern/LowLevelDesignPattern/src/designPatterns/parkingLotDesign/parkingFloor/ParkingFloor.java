package designPatterns.parkingLotDesign.parkingFloor;

import designPatterns.parkingLotDesign.enums.VehicleType;
import designPatterns.parkingLotDesign.parkingSpot.BikeParkingSpot;
import designPatterns.parkingLotDesign.parkingSpot.CarParkingSpot;
import designPatterns.parkingLotDesign.parkingSpot.ParkingSpot;
import designPatterns.parkingLotDesign.parkingSpot.TruckParkingSpot;
import designPatterns.parkingLotDesign.vehicle.VehicleInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ParkingFloor {

    private final String floorId;
    private List<ParkingSpot> parkingSpots;

    public ParkingFloor(String floorId) {
        this.floorId = floorId;
        this.parkingSpots = new ArrayList<>();
    }

    public void addParkingSpot(String spotId, VehicleType vehicleType) {
        switch (vehicleType) {
            case VehicleType.BIKE -> {
                parkingSpots.add(new BikeParkingSpot(spotId));
                break;
            }
            case VehicleType.CAR -> {
                parkingSpots.add(new CarParkingSpot(spotId));
                break;
            }
            case VehicleType.TRUCK -> {
                parkingSpots.add(new TruckParkingSpot(spotId));
                break;
            }
            default -> System.out.println("no vehicle type of this type exist");
        }
    }


    public ParkingSpot getNextVacantSpot(VehicleType vehicleType) throws Exception {
        return parkingSpots
                .stream()
                .filter(e -> {
                    return e.getVehicleSpotType() == vehicleType && e.isSpotVacant();
                })
                .findFirst()
                .orElseThrow(() -> new Exception("no vehicle spot empty"));

    }

    public Optional<ParkingSpot> getRequiredSpot(String spotId) {
        return parkingSpots
                .stream()
                .filter(spot -> spot.getSpotId().equals(spotId))
                .findFirst();

    }

    public String getFloorId() {
        return this.floorId;
    }

}
