package menus;

import model.Flight;
import model.WeatherConditions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

public class Menu {
    //Constant to modify the printf
    final static String ANSI_BLUE = "\u001B[34m";
    //Constants to format and tabulate the printed text
    final static String LINE = "**************************************************";
    final static String TAB = "%60s[%1s].%-80s\n";
    final static String TAB_HEADER = "%66s%-80s\n";

    //This is the main menu, the first menu that will be screen printed
    public static void printMainMenu(){
        System.out.println(ANSI_BLUE );
        String spaces = " %100s\n";
        System.out.printf(spaces, LINE);
        System.out.printf(TAB_HEADER, " ", "****Principal Menu****");
        System.out.printf(spaces, LINE);
        System.out.printf(TAB,"", "1", "Manage Flights");
        System.out.printf(spaces, LINE);
        System.out.printf(TAB,"", "2", "See Catalog of Allowed Aircraft");
        System.out.printf(spaces, LINE);
        System.out.printf(TAB,"", "3", "Generate reports");
        System.out.printf(spaces, LINE);
        System.out.printf(TAB,"", "4", "Enviar Reporte por correo");
        System.out.printf(spaces, LINE);
        System.out.printf(TAB,"", "5", "Leave");
        System.out.printf(spaces, LINE);
    }

    //This is the menu for 1. Manage Flights
    public static void printFlightMenu(){
        System.out.println(ANSI_BLUE );
        String spaces = " %100s\n";
        System.out.printf(spaces, LINE);
        System.out.printf(TAB_HEADER, " ", "****Flights Menu****");
        System.out.printf(spaces, LINE);
        System.out.printf(TAB,"", "1", "See Flight List");
        System.out.printf(spaces, LINE);
        System.out.printf(TAB,"", "2", "Add Flight");
        System.out.printf(spaces, LINE);
        System.out.printf(TAB,"", "3", "Update flight status");
        System.out.printf(spaces, LINE);
        System.out.printf(TAB,"", "0", "Return to the previous menu");
        System.out.printf(spaces, LINE);
    }

    static String headerTab = "|%-6s|%-15s|%-18s|%-32s|%-16s|%-32s|%-16s|%-10s||%-32s|\n";
    static String separatorLine =
            "+------+---------------+------------------+--------------------------------+----------------+--------------------------------+----------------+----------+--------------------------------+";

    //Method that will print the flights, it can go to an interface
    public static void printObjectList(List<Flight> flightList){
        WeatherConditions w= new WeatherConditions();

        System.out.printf(separatorLine + "\n");
        System.out.printf( headerTab, " Code", "     Airline", "   Aircraft", " Country/City Origin", "    Hour/Date",
                " Country/City Destination", "   Hour/Date", " Status", "Weather Conditions");
        System.out.println(separatorLine);
        for(Flight f : flightList){
            DateFormat hourdateFormat = new SimpleDateFormat("HH:mm dd/MM/yyyy");
            System.out.printf(headerTab, f.getFlightNumber(), f.getAirline(), "NO APLICA NAVE", f.getOrigin(),
                    hourdateFormat.format(f.getDepartureDateTime()), f.getDestination(),
                    hourdateFormat.format(f.getArrivalDateTime()), f.getStatus(), w.weatherconditions());
        }
        System.out.printf(separatorLine + "\n");
    }

}