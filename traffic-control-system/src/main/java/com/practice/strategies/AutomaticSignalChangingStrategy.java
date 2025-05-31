package com.practice.strategies;

import java.util.List;

import com.practice.models.Signal;
import com.practice.states.concretes.GreenSignalState;
import com.practice.states.concretes.RedSignalState;
import com.practice.states.concretes.YellowSignalState;

public class AutomaticSignalChangingStrategy implements SignalChangingStrategy {

    private final RedSignalState red = new RedSignalState();
    private final YellowSignalState yellow = new YellowSignalState();
    private final GreenSignalState green = new GreenSignalState();

    @Override
    public void start(List<Signal> signals) {

        for (Signal signal : signals) {
            System.out.println("Controlling signal: " + signal.getName());
            red.setSignal(signal);
            yellow.setSignal(signal);
            green.setSignal(signal);

            signal.changeSignal(red);

            try {

                Thread.sleep(3000);

            } catch (InterruptedException ex) {
                System.out.println("System got interrupted: " + ex.getMessage());
            }

            signal.changeSignal(yellow);

            try {

                Thread.sleep(10000);

            } catch (InterruptedException ex) {
                System.out.println("System got interrupted: " + ex.getMessage());
            }

            signal.changeSignal(green);

        }

    }

}
