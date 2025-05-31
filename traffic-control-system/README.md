# Traffic Control System

A Java application that simulates a traffic control system with multiple signals at a junction, supporting both automatic and manual signal changing strategies.

## Overview

This project implements a traffic control system that manages signals at a junction. Each signal cycles through three states (Red → Yellow → Green → Red) following traffic rules. The system supports two strategies for changing signals:

1. Automatic Strategy: Signals change automatically with predefined timings
2. Manual Strategy: User manually selects which signal to change and to what state

## Requirements gathered

1. Traffic Controll System will have ```Junctions```
2. A ```Junction``` will have  ```Signal```(s)
3. ```Signal``` determines all the three signals(lights) as an entity
4. Each signal will have 3 ```SignalState```(s)
    * ```RedSignalState```
    * ```GreenSignalState```
    * ```YellowSignalState```
5. Traffic Controll System will have two modes of operation
    * ```AutomaticSignalChanging``` — Signals are automatically changed
    * ```ManualSignalChanging``` — Traffic police can change any ```Signal```'s to any color

## Design Patterns Used

The project demonstrates several design patterns:

* **State Pattern:** Used for managing signal states (Red, Yellow, Green)
* **Strategy Pattern:** Used for implementing different signal changing strategies
* **Factory Method Pattern:** Used in the creation of signal states

## UML Diagram

![Traffic Control System UML Diagram](<Traffic Control System.png>)

## TODO

* [ ] Write test cases
