package designPatterns.parkingLotDesign.vehicle;

import designPatterns.parkingLotDesign.enums.VehicleType;

public interface VehicleInterface {

    String getVehicleNumber();
    VehicleType getVehicleType();
}