package Challenges;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Challenge15 {
    public static void main(String[] args) {
        ArrayList<String> fructe= new ArrayList<>();
        fructe.add("Grape");
        fructe.add("Strawberry");
        fructe.add("Banana");
        fructe.remove(2);
        System.out.println(fructe.contains("Grape"));
//        fructe.clear();
        fructe.add(1, "Mango");
        fructe.remove(0);
        fructe.add(0, "Penguin");
        for (String fructele : fructe){
            System.out.println(fructele);
        }

        ArrayList<String> produse= new ArrayList<>();
        List<Cart> cos= new ArrayList<>();
        Cart produs1= new Cart("Oua", 15.00);
        Cart produs2= new Cart("Banane", 5.00);
        Cart produs3= new Cart("Laptop", 3000.00);
        cos.add(produs1);
        cos.add(produs2);
        cos.add(produs3);
        double SumaPret= 0;
        System.out.println("Produsele selectate sunt: ");
        for (Cart produesele: cos){
            System.out.println(produesele.name);
        }
        for (Cart preturile: cos){
            System.out.println("Preturile produselor sunt: " +preturile.price + " Lei" );
        }
        for (Cart price: cos){
            SumaPret += price.price;
        }
        System.out.println("Suma totala a produselor este: "+ SumaPret + " Lei");
    }
}
