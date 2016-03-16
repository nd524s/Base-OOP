package com.epam.appliance.entity;

/**
 * Created by Никита on 24.11.2015.
 */
public class Fridge extends ElectricalAppliance {

    private double powerDeviation;
    private double powerValue;

    public Fridge() {
        super();
    }

    public Fridge(String model, boolean isSwitchedOn, double powerDeviation, double powerValue) {
        super(model, isSwitchedOn);
        this.powerDeviation = powerDeviation;
        this.powerValue = powerValue;
    }

    @Override
    public double colculatePower() {
        double powerValue = this.getPowerValue();
        double powerDeviation = this.getPowerDeviation();

        return powerValue + powerValue*powerDeviation;
    }

    public double getPowerValue() {
        return powerValue;
    }

    public void setPowerValue(double powerValue) {
        this.powerValue = powerValue;
    }

    public double getPowerDeviation() {
        return powerDeviation;
    }

    public void setPowerDeviation(double powerDeviation) {
        this.powerDeviation = powerDeviation;
    }
}
