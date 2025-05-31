package com.practice.models;

import java.util.ArrayList;
import java.util.List;

import com.practice.strategies.SignalChangingStrategy;

public class Junction {
    
    private List<Signal> signals;
    private SignalChangingStrategy signalChangingStrategy;

    public Junction(SignalChangingStrategy signalChangingStrategy) {
        this.signals = new ArrayList<>();
        this.signalChangingStrategy = signalChangingStrategy;
    }

    public void addSignal(Signal signal) {
        this.signals.add(signal);
    }

    public void removeSignal(Signal signal) {
        this.signals.remove(signal);
    }

    public void start() {
        signalChangingStrategy.start(signals);
    }

    public void setSignalChangingStrategy(SignalChangingStrategy signalChangingStrategy) {
        this.signalChangingStrategy = signalChangingStrategy;
    }

}


// Junction -> Motham system ki pettali, signalling strategy
// But Signal ki pedithe, we should make everything in sync -> something bigger problem
