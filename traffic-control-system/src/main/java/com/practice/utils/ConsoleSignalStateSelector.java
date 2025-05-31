package com.practice.utils;

import java.util.Scanner;

import com.practice.states.concretes.GreenSignalState;
import com.practice.states.concretes.RedSignalState;
import com.practice.states.concretes.YellowSignalState;
import com.practice.states.interfaces.SignalState;

public class ConsoleSignalStateSelector implements SignalStateSelector{
    
    @Override
    public SignalState selectSignalState() {

        Scanner sc = InputUtils.getScanner();
        
        System.out.println("Enter the singal color you want to change to");
        String signal = sc.nextLine();

        if(signal.toLowerCase().equals("red")) {
            return new RedSignalState();
        }
        else if(signal.toLowerCase().equals("yellow")) {
            return new YellowSignalState();
        }
        else {
            return new GreenSignalState();
        }
    }
}
