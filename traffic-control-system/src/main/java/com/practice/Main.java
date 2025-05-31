package com.practice;

import com.practice.models.Junction;
import com.practice.models.Signal;
import com.practice.strategies.AutomaticSignalChangingStrategy;
import com.practice.strategies.ManualSignalChangingStrategy;
import com.practice.strategies.SignalChangingStrategy;

public class Main {
    public static void main(String[] args) {

        Signal signal1 = new Signal("signal-1");
        Signal signal2 = new Signal("signal-2");
        Signal signal3 = new Signal("signal-3");
        Signal signal4 = new Signal("signal-4");
    
        SignalChangingStrategy signalChangingStrategy = new AutomaticSignalChangingStrategy();

        Junction junction = new Junction(signalChangingStrategy);

        junction.addSignal(signal1);
        junction.addSignal(signal2);
        junction.addSignal(signal3);
        junction.addSignal(signal4);

        // junction.start();

        System.out.println("------ Changing strategy ------");

        signalChangingStrategy = new ManualSignalChangingStrategy();
        junction.setSignalChangingStrategy(signalChangingStrategy);

        junction.start();
    }
}