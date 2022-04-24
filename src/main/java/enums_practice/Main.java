package enums_practice;

import java.util.Arrays;
import java.util.Objects;

public class Main {
    //Declaring vehicle enums inside a class
    enum Ford {
        MUSTANG,
        F150,
        F250,
        ESCAPE,
        BRONCO
    }
    enum GMC {
        SIERRA,
        YUKON,
        ACADIA,
        TERRAIN
    }

    public static void main(String[] args) {

        States GA = States.GA;
        States VA = States.VA;
        States MD = States.MD;

        TaxRates localTaxRate = new TaxRates(GA);
        System.out.println(localTaxRate.getCurrentStateTax(GA));
        Integer currentRate = (Integer) localTaxRate.getCurrentStateTax(VA);

        if(currentRate > 1) {
            System.out.println("You win the low tax rate prize!!!");
        }

        System.out.println(currentRate);



        //Color enum
        Color color1 = Color.BLUE;
        System.out.println("\n" + color1 + "\n");

        // Calling values()
        Color[] colorValue = Color.values();
        System.out.println(Arrays.toString(Color.values()));

        // enum with loop
        for(Color e : colorValue) {
            // Calling ordinal() to find index
            System.out.println(e + " at index " + e.ordinal());
        }

        //Getting the weather
        Day day = new Day(Days.MONDAY);
        System.out.println();
        System.out.println(day.currentDaysWeather(day.getCurrentDay()));

        //**************************************************************************
        //Vehicle Enums
        Ford ford = Ford.MUSTANG;
        GMC gmc = GMC.YUKON;

    }
}
