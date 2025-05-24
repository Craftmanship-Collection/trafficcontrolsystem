package src.logging;

import src.core.enums.Direction;
import src.core.enums.SignalState;

import java.util.List;

public class LogManager {

    private List<Log> logs;
    public void logSignalChange(Direction direction, SignalState state, int duration) {
        System.out.printf("Log: %s changed to %s for %ds\n", direction, state, duration);
    }

    public void logTrafficData(String location, int density) {
        System.out.printf("Log: Location=%s, Traffic Density=%d\n", location, density);
    }
}
