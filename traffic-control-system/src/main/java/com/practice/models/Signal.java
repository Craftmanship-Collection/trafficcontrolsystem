package com.practice.models;

import com.practice.states.concretes.RedSignalState;
import com.practice.states.interfaces.SignalState;

public class Signal {
    
    private String name;
    private SignalState signalState;

    public Signal(String name) {
        this.name = name;
        this.signalState = new RedSignalState(this);
    }

    public SignalState getSignalState() {
        return signalState;
    }

    public void setSignalState(SignalState signalState) {
        this.signalState = signalState;
    }

    public void changeSignal(SignalState signalState) {
        this.signalState = signalState;
        signalState.changeSignal();
    }

    public String getName() {
        return name;
    }


}
