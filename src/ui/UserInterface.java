package src.ui;

import src.core.TrafficSignal;
import src.core.enums.SignalState;

public class UserInterface {
    public void displayDashboard() {
        System.out.println("Dashboard: Monitoring traffic...");
    }

    public void manualOverride(TrafficSignal signal, SignalState state, int duration) {
        signal.setState(state, duration);
    }
}
