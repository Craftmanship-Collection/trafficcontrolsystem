package com.practice.strategies;

import java.util.List;

import com.practice.models.Signal;
import com.practice.states.interfaces.SignalState;
import com.practice.utils.ConsoleSignalSelector;
import com.practice.utils.ConsoleSignalStateSelector;
import com.practice.utils.SignalSelector;
import com.practice.utils.SignalStateSelector;

public class ManualSignalChangingStrategy implements SignalChangingStrategy{

    private SignalSelector signalSelector;
    private SignalStateSelector signalStateSelector;

    public ManualSignalChangingStrategy(
        SignalSelector signalSelector,
        SignalStateSelector signalStateSelector
    ) {
        this.signalSelector = signalSelector;
        this.signalStateSelector = signalStateSelector;
    }

    public ManualSignalChangingStrategy() {
        this.signalSelector = new ConsoleSignalSelector();
        this.signalStateSelector = new ConsoleSignalStateSelector();
    }

    @Override
    public void start(List<Signal> signals) {

        signalSelector.setSignals(signals);

        Signal signal = signalSelector.signalSelect();
        SignalState signalState = signalStateSelector.selectSignalState();

        signalState.setSignal(signal);

        signal.changeSignal(signalState);
    }
    
}
