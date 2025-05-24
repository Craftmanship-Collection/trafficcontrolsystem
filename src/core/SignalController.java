package src.core;

import src.algorithm.TimingAlgorithm;
import src.core.enums.SignalState;

import java.util.List;

public class SignalController {
    private final TimingAlgorithm algorithm;

    public SignalController(TimingAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    public void changeSignal(List<TrafficSignal> signals, List<TrafficSensor> sensors, PedestrianButton button) {
        for (TrafficSignal signal : signals) {
            int density = sensors.get(0).detectDensity(); // simplified mapping
            int duration = algorithm.calculateDuration(density);

            if (button.isPressed()) {
                signal.setState(SignalState.RED, 5); // let pedestrian cross
            } else {
                signal.setState(SignalState.GREEN, duration);
            }
        }
    }

    public void overrideSignal(TrafficSignal signal, SignalState state, int duration) {
        signal.setState(state, duration);
    }
}
