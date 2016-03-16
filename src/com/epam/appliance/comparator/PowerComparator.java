package com.epam.appliance.comparator;

import com.epam.appliance.entity.ElectricalAppliance;

import java.util.Comparator;

/**
 * Created by Никита on 25.11.2015.
 */
public class PowerComparator implements Comparator<ElectricalAppliance> {

    @Override
    public int compare(ElectricalAppliance o1, ElectricalAppliance o2) {

        double power1 = o1.colculatePower();
        double power2 = o2.colculatePower();

        if(power1>power2){
            return 1;
        } else if(power1<power2){
            return -1;
        } else{
            return 0;
        }

    }

}
