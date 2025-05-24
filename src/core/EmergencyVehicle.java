package src.core;

import src.core.enums.VehicleType;

class EmergencyVehicle {
    private final VehicleType type = VehicleType.EMERGENCY;
    private final String location;

    public EmergencyVehicle(String location) {
        this.location = location;
    }

    public String getLocation() { return location; }
    public VehicleType getType() { return type; }
}