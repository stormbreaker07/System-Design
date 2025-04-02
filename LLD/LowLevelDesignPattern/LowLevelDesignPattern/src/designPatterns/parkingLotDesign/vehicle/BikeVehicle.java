package designPatterns.parkingLotDesign.vehicle;

import designPatterns.parkingLotDesign.enums.VehicleType;

public class BikeVehicle implements VehicleInterface{

    private final String vehicleNumber;

    public BikeVehicle(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    @Override
    public String getVehicleNumber() {
        return this.vehicleNumber;
    }

    @Override
    public VehicleType getVehicleType() {
        return VehicleType.BIKE;
    }
}
