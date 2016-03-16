package com.epam.appliance.action;

import com.epam.appliance.creator.AppliancesCreator;
import com.epam.appliance.entity.ElectricalAppliance;
import org.apache.log4j.Logger;


/**
 * Created by Никита on 24.11.2015.
 */
public class PowerColculation {
    static Logger Log = Logger.getLogger(PowerColculation.class);

    public double getTotalPower(AppliancesCreator appliancesCreator){
        double totalPower = 0;

        for(ElectricalAppliance electricalAppliance : appliancesCreator.getElectricalAppliances()){
            if(electricalAppliance.getIsSwitchedOn()){
                totalPower+=electricalAppliance.colculatePower();
            }
        }

        if(totalPower == 0){
            Log.info("All appliances are switched off");
        }
        return totalPower;
    }
}
