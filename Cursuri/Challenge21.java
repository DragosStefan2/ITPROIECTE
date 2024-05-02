package Cursuri;

import java.util.ArrayList;

public class Challenge21 {
    public static void main(String[] args) {
        Cursuri.Vehicle newCar= new Cursuri.Car();
        Cursuri.Vehicle newTruck= new Cursuri.Truck();
        System.out.println(newCar.fuelType());
        System.out.println(newTruck.fuelType());

        ArrayList<String> listanoua= new ArrayList<>();
        listanoua.add(0, "Mere");
        listanoua.add(1, "Pere");
        listanoua.add(2, "Banane");

        Cursuri.ListRetriever listanouaP= new Cursuri.ListRetriever();
        listanouaP.retriveElement(listanoua, 1);
        System.out.println(listanouaP.retriveElement(listanoua, 2));


    }
}
