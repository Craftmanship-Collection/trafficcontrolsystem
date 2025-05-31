package com.practice.strategies;

import java.util.List;

import com.practice.models.Signal;

public interface SignalChangingStrategy {
    
    void start(List<Signal> signals);

}
