package designPatterns.parkingLotDesign.parkingSpot;

import designPatterns.parkingLotDesign.enums.VehicleType;
import designPatterns.parkingLotDesign.vehicle.VehicleInterface;

public class CarParkingSpot implements ParkingSpot{

    private final VehicleType vehicleSpotType;
    private final String spotId;
    private boolean isVacant;
    private VehicleInterface assignedVehicle;

    public CarParkingSpot(String spotId) {
        this.spotId = spotId;
        this.isVacant = true;
        this.vehicleSpotType = VehicleType.CAR;
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
        if(vehicle.getVehicleType() != VehicleType.CAR)
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

