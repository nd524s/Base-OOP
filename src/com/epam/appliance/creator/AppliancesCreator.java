package com.epam.appliance.creator;

import com.epam.appliance.entity.ElectricPump;
import com.epam.appliance.entity.ElectricalAppliance;
import com.epam.appliance.entity.Fridge;
import com.epam.appliance.entity.WashingMachine;

import java.util.ArrayList;

/**
 * Created by Никита on 24.11.2015.
 */
public class AppliancesCreator {

    private ArrayList<ElectricalAppliance> electricalAppliances = new ArrayList<>();
    {
        electricalAppliances.add(new Fridge("Samsung RB37", true, 0.1, 1000));
        electricalAppliances.add(new Fridge("LG GA489", false, 0.12, 1100));
        electricalAppliances.add(new ElectricPump("Eco CP", true, 400, 0.8));
        electricalAppliances.add(new WashingMachine("LG F109", true, 0.7, 210, 0.2));
    }

    public ArrayList<ElectricalAppliance> getElectricalAppliances() {
        ArrayList<ElectricalAppliance> list = new ArrayList<>();

        for(ElectricalAppliance electricalAppliance : this.electricalAppliances){
            list.add(electricalAppliance);
        }
        return list;
    }

    public void add(ElectricalAppliance electricalAppliance){
        electricalAppliances.add(electricalAppliance);
    }

    public ElectricalAppliance get(int index){
        return electricalAppliances.get(index);
    }

    public void remove(int index){
        electricalAppliances.remove(index);
    }
}

