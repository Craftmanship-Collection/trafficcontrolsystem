package com.practice.utils;

import java.util.List;
import java.util.Scanner;

import com.practice.models.Signal;

public class ConsoleSignalSelector implements SignalSelector{
    
    private List<Signal> signals;

    public ConsoleSignalSelector() {

    }

    public ConsoleSignalSelector(List<Signal> signals) {
        this.signals = signals;
    }

    public void setSignals(List<Signal> signals) {
        this.signals = signals;
    }

    @Override
    public Signal signalSelect() {
        
        Scanner sc = InputUtils.getScanner();

        System.out.println("Enter signal");
        int singalNumber = Integer.parseInt(sc.nextLine());

        return signals.get(singalNumber);

    }

}
