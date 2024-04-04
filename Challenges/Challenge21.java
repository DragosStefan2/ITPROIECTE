package Challenges;

import java.util.ArrayList;

public class Challenge21 {
    public static void main(String[] args) {
        Vehicle newCar= new Car();
        Vehicle newTruck= new Truck();
        System.out.println(newCar.fuelType());
        System.out.println(newTruck.fuelType());

        ArrayList<String> listanoua= new ArrayList<>();
        listanoua.add(0, "Mere");
        listanoua.add(1, "Pere");
        listanoua.add(2, "Banane");

        ListRetriever listanouaP= new ListRetriever();
        listanouaP.retriveElement(listanoua, 1);
        System.out.println(listanouaP.retriveElement(listanoua, 2));


    }
}
