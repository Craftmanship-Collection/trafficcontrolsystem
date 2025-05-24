package src.core;

import src.adapter.ExternalSystemAdapter;
import src.backup.PowerBackupSystem;
import src.logging.LogManager;
import src.pattern.TrafficPatternManager;
import src.ui.UserInterface;

import java.util.ArrayList;
import java.util.List;

public class TrafficManagementSystem {
    private static final TrafficManagementSystem instance = new TrafficManagementSystem();

    private final List<Intersection> intersections = new ArrayList<>();
    private final UserInterface ui = new UserInterface();
    private final LogManager logManager = new LogManager();
    private final PowerBackupSystem powerBackup = new PowerBackupSystem();
    private final TrafficPatternManager patternManager = new TrafficPatternManager();
    private final ExternalSystemAdapter externalAdapter = new ExternalSystemAdapter();

    public TrafficManagementSystem() {
        intersections.add(new Intersection("Junction-1"));
    }

    public static TrafficManagementSystem getInstance() {
        return instance;
    }

    public void monitorTraffic() {
        System.out.println("Monitoring all intersections...");
        intersections.forEach(Intersection::operate);
    }

    public void respondToEmergency() {
        System.out.println("Emergency detected. Prioritizing...");
    }

    public void detectTrafficPatterns() {
        patternManager.adjustForTrafficPattern();
    }

    public void integrateWithExternalSystem() {
        externalAdapter.syncWithCentralSystem();
        externalAdapter.receiveInstructions();
    }

    public void runSystemCycle() {
        ui.displayDashboard();
        monitorTraffic();
        detectTrafficPatterns();
        integrateWithExternalSystem();
        if (!powerBackup.checkPowerStatus()) {
            powerBackup.activateBackup();
        }
    }
}
