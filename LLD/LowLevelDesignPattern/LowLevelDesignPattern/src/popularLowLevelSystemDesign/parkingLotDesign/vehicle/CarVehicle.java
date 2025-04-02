package popularLowLevelSystemDesign.parkingLotDesign.vehicle;

import popularLowLevelSystemDesign.parkingLotDesign.enums.VehicleType;

public class CarVehicle implements VehicleInterface{

    private final String vehicleNumber;

    public CarVehicle(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    @Override
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    @Override
    public VehicleType getVehicleType() {
        return VehicleType.CAR;
    }
}
