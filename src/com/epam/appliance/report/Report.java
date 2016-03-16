package com.epam.appliance.report;

import com.epam.appliance.action.PowerColculation;
import com.epam.appliance.action.PowerSearch;
import com.epam.appliance.action.PowerSort;
import com.epam.appliance.comparator.PowerComparator;
import com.epam.appliance.creator.AppliancesCreator;
import com.epam.appliance.entity.ElectricalAppliance;
import com.epam.appliance.exception.IncorrectIntervalException;
import com.epam.appliance.exception.NoModelException;

/**
 * Created by Никита on 23.11.2015.
 */
public class Report {

    public void printTotalPower(PowerColculation powerColculation, AppliancesCreator listOfAppliances){
        System.out.println("---Total power of all switched on electric appliances---" + powerColculation.getTotalPower(listOfAppliances) + "\n");
    }

    public void printOrderedAppliance(PowerSort powerSort, AppliancesCreator listOfAppliances, PowerComparator powerComparator){
        System.out.println("---List of ordered appliances---");

        for(ElectricalAppliance i : powerSort.orderedAppliances(powerComparator, listOfAppliances)){
            System.out.println("Model of appliance: " + i.getModel() + ". Power: " + i.colculatePower() + " (Watt)");
        }
    }

    public void printSearchByPowerInterval(PowerSearch powerSearch, AppliancesCreator listOfAppliances, double a, double b) throws IncorrectIntervalException {
        System.out.println("\n" + "---Power from " + a + "(Watt) to " + b +" (Watt) ---");

        for(ElectricalAppliance i : powerSearch.searchByPowerInterval(a, b, listOfAppliances)){
            System.out.println("Model of appliance: "+ i.getModel()+". Power: " + i.colculatePower() + " (Watt)");
        }
    }

    public void printSearchByModel(PowerSearch powerSearch, AppliancesCreator listOfAppliances, String model) throws NoModelException{
        System.out.println("\n" + "---Selected models---");

        for(ElectricalAppliance i : powerSearch.searchByModel(model, listOfAppliances)){
            System.out.println("Model of appliance: " + i.getModel() + ". Power: "+ i.colculatePower() + " (Watt)");
        }
    }

}
