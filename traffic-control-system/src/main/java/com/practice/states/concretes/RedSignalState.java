package com.practice.states.concretes;

import com.practice.models.Signal;
import com.practice.states.interfaces.SignalState;

public class RedSignalState implements SignalState {

    private Signal signal;

    public RedSignalState() {
    }

    public RedSignalState(Signal signal) {
        this.signal = signal;
    }

    @Override
    public void changeSignal() {
        System.out.println("Change signal: Red -> Yellow");
        signal.setSignalState(new YellowSignalState(signal));
    }

    @Override
    public void setSignal(Signal signal) {
        this.signal = signal;
    }

}
