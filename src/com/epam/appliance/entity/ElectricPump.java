package com.epam.appliance.entity;

/**
 * Created by Никита on 24.11.2015.
 */
public class ElectricPump extends ElectricalAppliance {

    private double termalPower;
    private double cosine;

    public ElectricPump() {
        super();
    }

    public ElectricPump(String model, boolean isSwitchedOn, double termalPower, double cosine) {
        super(model, isSwitchedOn);
        this.termalPower = termalPower;
        this.cosine = cosine;
    }

    @Override
    public double colculatePower() {
        double termalPower = this.getTermalPower();
        double cosine = this.getCosine();

        return termalPower / cosine;
    }

    public double getTermalPower() {
        return termalPower;
    }

    public void setTermalPower(double termalPower) {
        this.termalPower = termalPower;
    }

    public double getCosine() {
        return cosine;
    }

    public void setCosine(double cosine) {
        this.cosine = cosine;
    }
}
