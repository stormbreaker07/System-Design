package popularLowLevelSystemDesign.parkingLotDesign.parkingSpot;

import popularLowLevelSystemDesign.parkingLotDesign.enums.VehicleType;
import popularLowLevelSystemDesign.parkingLotDesign.vehicle.VehicleInterface;

public interface ParkingSpot {

    String getSpotId();
    boolean isSpotVacant();
    void assignVehicle(VehicleInterface vehicle);
    void vacantSpot();
    VehicleType getVehicleSpotType();

}
