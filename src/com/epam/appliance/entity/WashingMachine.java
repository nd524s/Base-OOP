package com.epam.appliance.entity;

/**
 * Created by Никита on 24.11.2015.
 */
public class WashingMachine extends ElectricalAppliance {

    private double current;
    private double voltage;
    private double powerDeviation;

    public WashingMachine() {
        super();
    }

    public WashingMachine(String model, boolean isSwitchedOn, double current, double voltage, double powerDeviation) {
        super(model, isSwitchedOn);
        this.current = current;
        this.voltage = voltage;
        this.powerDeviation = powerDeviation;
    }

    @Override
    public double colculatePower() {
        double current = this.getCurrent();
        double voltage = this.getVoltage();
        double powerDeviation = this.getPowerDeviation();

        return current * voltage + current * voltage * powerDeviation ;
    }

    public double getCurrent() {
        return current;
    }

    public void setCurrent(double current) {
        this.current = current;
    }

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    public double getPowerDeviation() {
        return powerDeviation;
    }

    public void setPowerDeviation(double powerDeviation) {
        this.powerDeviation = powerDeviation;
    }
}
