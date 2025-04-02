package designPatterns.parkingLotDesign.parkingSpot;

import designPatterns.parkingLotDesign.enums.VehicleType;
import designPatterns.parkingLotDesign.vehicle.VehicleInterface;

public interface ParkingSpot {

    String getSpotId();
    boolean isSpotVacant();
    void assignVehicle(VehicleInterface vehicle);
    void vacantSpot();
    VehicleType getVehicleSpotType();

}
