package com.practice.states.concretes;

import com.practice.models.Signal;
import com.practice.states.interfaces.SignalState;

public class GreenSignalState implements SignalState {

    private Signal signal;

    public GreenSignalState() {}

    public GreenSignalState(Signal signal) {
        this.signal = signal;
    }

    @Override
    public void changeSignal() {
        System.out.println("Change signal: Green -> Red");
        signal.setSignalState(new RedSignalState(signal));
    }

    @Override
    public void setSignal(Signal signal) {
        this.signal = signal;
    }
    
}
