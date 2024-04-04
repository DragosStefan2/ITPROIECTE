package Challenges;

import java.util.HashMap;

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
    }
}
