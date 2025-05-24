package src.core;

import src.algorithm.DefaultTimingAlgorithm;
import src.core.enums.Direction;
import src.core.enums.SensorType;

import java.util.ArrayList;
import java.util.List;

public class Intersection {
    private final List<TrafficSignal> signals;
    private final List<TrafficSensor> sensors;
    private final PedestrianButton pedestrianButton;
    private final SignalController signalController;
    private final String location;

    public Intersection(String location) {
        this.location = location;
        this.signals = new ArrayList<>();
        this.sensors = new ArrayList<>();
        this.pedestrianButton = new PedestrianButton();
        this.signalController = new SignalController(new DefaultTimingAlgorithm());
        for (Direction dir : Direction.values()) {
            signals.add(new TrafficSignal(dir));
            sensors.add(new TrafficSensor(SensorType.CAMERA, location));
        }
    }

    public void operate() {
        signalController.changeSignal(signals, sensors, pedestrianButton);
    }

    public void coordinateWithOtherIntersections() {
        // Stub for coordination
    }

    public PedestrianButton getPedestrianButton() {
        return pedestrianButton;
    }
}
