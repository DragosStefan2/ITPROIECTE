package Cursuri;

import java.util.ArrayList;

public class Sesiunea15 {
    public static void main(String[] args) {
        /** ArrayList*/
        ArrayList<String> numeMasini= new ArrayList<>();
        numeMasini.add("Masina1");
        numeMasini.add("Masina2");
        numeMasini.add("Masine3");
        for(String masini: numeMasini){
            System.out.println(masini);
        }

        System.out.println(numeMasini.get(1));

        System.out.println("Lungimea ArrayList este: "+ numeMasini.size());

        System.out.println("ArrayList nu este gol?: "+ numeMasini.isEmpty());

        numeMasini.remove(2);
        numeMasini.clear();

        for(String masini: numeMasini) {
            System.out.println("Stergem elementul din ArrayList: " + masini);
        }

        System.out.println(numeMasini.contains("Masina1"));

    }
}
