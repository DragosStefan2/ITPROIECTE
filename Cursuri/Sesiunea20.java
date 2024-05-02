package Cursuri;

import java.util.*;

public class Sesiunea20 {
    public static void main(String[] args) {
        HashMap<Integer, String> Cursuri= new HashMap<Integer, String>();
        Cursuri.put(10, "Curs1");
        Cursuri.put(9, "Curs2");
        Cursuri.put(8, "Curs3");
        System.out.println(Cursuri.get(8));
        System.out.println("------------------");
        for(Integer nota: Cursuri.keySet()){
            System.out.println(Cursuri.get(nota));
        }

        for (Map.Entry<Integer, String> entry : Cursuri.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value :" + entry.getValue());
        }

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(List.of(1, 2 ,3 , 4 , 5 ,6 , 7));
        Collections.sort(numbers);
        for ( Integer number: numbers){
            //
        }

        numbers.forEach(
                (number) -> {System.out.println(number);
                });
}
}
