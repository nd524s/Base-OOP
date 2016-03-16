package com.epam.appliance.main;

import com.epam.appliance.action.PowerColculation;
import com.epam.appliance.action.PowerSearch;
import com.epam.appliance.action.PowerSort;
import com.epam.appliance.comparator.PowerComparator;
import com.epam.appliance.creator.AppliancesCreator;
import com.epam.appliance.exception.IncorrectIntervalException;
import com.epam.appliance.exception.NoModelException;
import com.epam.appliance.report.Report;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

/**
 * Created by Никита on 23.11.2015.
 */
public class Main {

    static {
      new DOMConfigurator().doConfigure("log4j.xml", LogManager.getLoggerRepository());
    }

    static Logger Log = Logger.getLogger(Main.class);

    public static void main(String[] args){
        AppliancesCreator listOfAppliances = new AppliancesCreator();
        PowerColculation powerColculation = new PowerColculation();
        PowerSearch powerSearch = new PowerSearch();
        PowerSort powerSort = new PowerSort();
        PowerComparator powerComparator = new PowerComparator();
        Report report = new Report();

        report.printTotalPower(powerColculation, listOfAppliances);
        report.printOrderedAppliance(powerSort, listOfAppliances, powerComparator);

        try {
            report.printSearchByPowerInterval(powerSearch, listOfAppliances, PowerSearch.LOW_BORDER_OF_INTERVAL, PowerSearch.HIGH_BORDER_OF_INTERVAL);
        } catch (IncorrectIntervalException e) {
           Log.error("Incorrect interval", e);
        }

        try {
            report.printSearchByModel(powerSearch, listOfAppliances, "LG F109");
        } catch (NoModelException e) {
            Log.error(e);
        }
    }
}
