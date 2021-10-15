package helpers;

import menus.Menu;
import utilities.Flight;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

public class RequestInfo {
    final static Scanner sc= new Scanner(System.in);

    //Method to request the info by console to get a new flight
    public static Flight requestFlight(List<Flight> flightList){
        Flight f = new Flight();
        f.setFlightNumber(flightList.size());
        System.out.println("Ingrese el nombre de la aerolínea");
        f.setAirline(sc.nextLine());
        for(int i=0; i< flightList.size(); i++){
            System.out.println(i + ". " + flightList.get(i).getOrigin());
        }
        System.out.println("Ingrese el origen del vuelo");
        f.setOrigin(flightList.get(sc.nextInt()).getOrigin());

        for(int i=0; i< flightList.size(); i++){
            System.out.println(i + ". " + flightList.get(i).getDestination());
        }
        System.out.println("Ingrese el destino del vuelo");
        f.setDestination(flightList.get(sc.nextInt()).getDestination());

        f.setStatus("On Time");

        System.out.println("Ingrese la fecha de salida en formato dd/mm/aaaa");
        DateFormat hourdateFormat = new SimpleDateFormat("HH:mm dd/MM/yyyy");
        String depDate = sc.next();
        System.out.println("Ingrese la hora de salida en formato hh:mm");
        String depHour = sc.next();

        System.out.println("Ingrese la fecha de llegada en formato dd/mm/aaaa");
        String arrivalDate = sc.next();
        System.out.println("Ingrese la hora de salida en formato hh:mm");
        String arrivalHour = sc.next();
        try {
            f.setDepartureDateTime(hourdateFormat.parse(depHour + " " + depDate));
            f.setArrivalDateTime(hourdateFormat.parse(arrivalHour + " " + arrivalDate));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return f;
    }

    //Method to request the user by console what flight will be changed her status
    public static void requestChangeState(List<Flight> flightList){
        System.out.println("Verifique el cuadro de vuelos para actualizar el estado de algun vuelo");
        Menu.printObjectList(flightList);
        System.out.println("Ingrese el codigo de vuelo al que desea actualizar su estado");
        Flight f = Find.findFlight(sc.nextInt(), flightList);
        sc.nextLine();
        System.out.println("Ingrese el nuevo estado del vuelo");
        f.setStatus(sc.nextLine());
        if(f.getStatus().equals("Canceled")){
            System.out.println("Ingrese la razón por la cual cancela el vuelo");
            f.setReasonToCancel(sc.nextLine());
        }
    }
}