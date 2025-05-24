package src.core;

import src.core.enums.Direction;
import src.core.enums.SignalState;

public class TrafficSignal {
    private SignalState state;
    private final Direction direction;
    private int duration; // in seconds

    public TrafficSignal(Direction direction) {
        this.direction = direction;
        this.state = SignalState.RED;
    }

    public void setState(SignalState state, int duration) {
        this.state = state;
        this.duration = duration;
        System.out.println("Signal [" + direction + "] changed to " + state + " for " + duration + " seconds.");
    }

    public SignalState getState() { return state; }
    public Direction getDirection() { return direction; }
}
