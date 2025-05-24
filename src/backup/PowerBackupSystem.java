package src.backup;

import java.util.Random;

public class PowerBackupSystem {
    private boolean isBackupActive = false;

    public void activateBackup() {
        isBackupActive = true;
        System.out.println("Backup power activated.");
    }

    public boolean checkPowerStatus() {
        return new Random().nextBoolean();
    }
}
