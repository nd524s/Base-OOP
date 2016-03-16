package com.epam.appliance.action;

import com.epam.appliance.creator.AppliancesCreator;
import com.epam.appliance.entity.ElectricalAppliance;
import com.epam.appliance.exception.IncorrectIntervalException;
import com.epam.appliance.exception.NoModelException;
import org.apache.log4j.Logger;

import java.util.ArrayList;

/**
 * Created by Никита on 25.11.2015.
 */
public class PowerSearch {
    static Logger Log = Logger.getLogger(PowerSearch.class);
    public static double LOW_BORDER_OF_INTERVAL = 100;
    public static double HIGH_BORDER_OF_INTERVAL = 800;

    public ArrayList<ElectricalAppliance> searchByPowerInterval(double a, double b, AppliancesCreator appliancesCreator) throws IncorrectIntervalException {
        ArrayList<ElectricalAppliance> list = new ArrayList<>();

        if((a > b) || (a < 0) || (b < 0)){
            throw new IncorrectIntervalException("Check out the boundaries of the interval");
        }

        for(ElectricalAppliance electricalAppliance : appliancesCreator.getElectricalAppliances()){
            if(electricalAppliance.colculatePower() >= a && electricalAppliance.colculatePower() <= b){
                list.add(electricalAppliance);
            }
        }

        if(list.isEmpty()){
            Log.info("Nothing Found");
        }
        return list;
    }

    public ArrayList<ElectricalAppliance> searchByModel(String model, AppliancesCreator listOfAppliances) throws NoModelException{
        ArrayList<ElectricalAppliance> list = new ArrayList<>();

        if(model.isEmpty()){
            throw new NoModelException("Choose model");
        }

        for(ElectricalAppliance electricalAppliance : listOfAppliances.getElectricalAppliances()){
            if(electricalAppliance.getModel().equals(model)){
                list.add(electricalAppliance);
            }
        }

        if(list.isEmpty()){
            Log.info("Nothing Found");
        }
        return list;
    }
}
