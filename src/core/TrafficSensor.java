package src.core;

import src.core.enums.SensorType;
import src.core.enums.VehicleType;

import java.util.Random;

public class TrafficSensor {
    private final SensorType type;
    private final String location;

    public TrafficSensor(SensorType type, String location) {
        this.type = type;
        this.location = location;
    }

    public int detectDensity() {
        return new Random().nextInt(100); // mock
    }

    public VehicleType classifyVehicle() {
        VehicleType[] types = VehicleType.values();
        return types[new Random().nextInt(types.length)];
    }
}
