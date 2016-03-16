package com.epam.appliance.entity;

/**
 * Created by Никита on 24.11.2015.
 */
public abstract class ElectricalAppliance {
    private String model;
    private boolean isSwitchedOn;

    public ElectricalAppliance() {
    }

    public ElectricalAppliance(String model, boolean isSwitchedOn) {
        this.model = model;
        this.isSwitchedOn = isSwitchedOn;
    }
    public abstract double colculatePower();

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean getIsSwitchedOn() {
        return isSwitchedOn;
    }

    public void setIsSwitchedOn(boolean isSwitchedOn) {
        this.isSwitchedOn = isSwitchedOn;
    }

}
