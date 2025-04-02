package designPatterns.parkingLotDesign.parkingSpot;

import designPatterns.parkingLotDesign.enums.VehicleType;
import designPatterns.parkingLotDesign.vehicle.VehicleInterface;

public class TruckParkingSpot  implements ParkingSpot{

    private final String spotId;
    private final VehicleType vehicleSpotType;
    private boolean isVacant;
    private VehicleInterface assignedVehicle;

    public TruckParkingSpot(String spotId) {
        this.spotId = spotId;
        this.isVacant = true;
        this.vehicleSpotType = VehicleType.TRUCK;
    }

    @Override
    public String getSpotId() {
        return spotId;
    }

    @Override
    public boolean isSpotVacant() {
        return this.isVacant;
    }

    @Override
    public void assignVehicle(VehicleInterface vehicle) {
        if(vehicle.getVehicleType() != VehicleType.TRUCK)
            throw new RuntimeException("barking not allowed");

        this.isVacant = false;
        this.assignedVehicle = vehicle;
    }

    @Override
    public void vacantSpot() {
        this.assignedVehicle = null;
        this.isVacant = true;
    }

    @Override
    public VehicleType getVehicleSpotType() {
        return this.vehicleSpotType;
    }
}

