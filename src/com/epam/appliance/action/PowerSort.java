package com.epam.appliance.action;

import com.epam.appliance.comparator.PowerComparator;
import com.epam.appliance.creator.AppliancesCreator;
import com.epam.appliance.entity.ElectricalAppliance;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Никита on 25.11.2015.
 */
public class PowerSort {

    public ArrayList<ElectricalAppliance> orderedAppliances(PowerComparator powerComparator, AppliancesCreator listOfAppliances){
        ArrayList<ElectricalAppliance> list = listOfAppliances.getElectricalAppliances();

        Collections.sort(list, powerComparator);
        return list;
    }
}
