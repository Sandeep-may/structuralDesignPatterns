package com.codewithmosh.bridge;

//Basic Remote Control (turnOn, turnOff)
//Advanced Remote Control (SetChannel)
//Movie Remote Control (play, pause, rewind)

// Hierarchy
// RemoteControl
//  SonyRemoteControl
//  AdvancedRemoteControl
//    SonyAdvancedRemoteControl

public class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void turnOn(){
        device.turnOn();
    }

    public void turnOff(){
        device.turnOff();
    }
}
