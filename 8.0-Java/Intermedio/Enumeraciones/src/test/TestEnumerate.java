package test;

import enumerate.Continents;
import enumerate.Days;

public class TestEnumerate {
    public static void main(String[] args) {
        System.out.println("First Day" + Days.MONDAY);
        pickDay(Days.FRIDAY);
        System.out.println();
        System.out.println("Continent: "+ Continents.AMERICA);
        System.out.println("Num of countries: "+ Continents.AMERICA.getCountries());
        System.out.println("Best country: "+ Continents.AMERICA.getBestCountry());
        System.out.println();
        System.out.println("Continent: "+ Continents.EUROPE);
        System.out.println("Num of countries: "+ Continents.EUROPE.getCountries());
        System.out.println("Best country: "+ Continents.EUROPE.getBestCountry());
    }

    private static void pickDay(Days days){
        System.out.println(days);
        switch (days){
            case MONDAY:
                System.out.println("First day of the week");
                break;
            case TUESDAY:
                System.out.println("Second day of the week");
                break;
            case WEDNESDAY:
                System.out.println("Third day of the week");
                break;
            case THURSDAY:
                System.out.println("Fourth day of the week");
                break;
            case FRIDAY:
                System.out.println("Fifth day of the week");
                break;
            case SATURDAY:
                System.out.println("Sixth day of the week");
                break;
            case SUNDAY:
                System.out.println("Seventh day of the week");
                break;
}
    }
}
