package com.practice.states.concretes;

import com.practice.models.Signal;
import com.practice.states.interfaces.SignalState;

public class YellowSignalState implements SignalState {

    private Signal signal;

    public YellowSignalState() {}

    public YellowSignalState(Signal signal) {
        this.signal = signal;
    }

    @Override
    public void changeSignal() {

        System.out.println("Change signal: Yellow -> Green");
        signal.setSignalState(new GreenSignalState(signal));

    }

    @Override
    public void setSignal(Signal signal) {
        this.signal = signal;
    }

}
