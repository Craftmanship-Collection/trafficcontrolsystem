package com.practice.utils;

import java.util.List;

import com.practice.models.*;


public interface SignalSelector {
    
    Signal signalSelect();
    void setSignals(List<Signal> signals);

}
