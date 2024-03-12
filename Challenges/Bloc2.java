package Challenges;

import java.sql.SQLOutput;

public class Bloc2 {
    /** 4 proprietati*/
    int numarApartamente;
    String numeleProprietarilor;
    String adresa;

    String scara;
   /** getter si setter*/

    int getNumarApartamente(){
        return numarApartamente;
    }
    void setAdresa(String adresanoua){
        this.adresa=adresanoua;
    }

    /** 4 metode statice*/

    static void metodaX(){
        System.out.println("Am folosit metoda X.");
    }

    static void apa(){
        System.out.println("Plata la apa se face in perioda X-Y");
    }

    static void oameniPlata(){
        System.out.println("Acesti oameni de obicei nu platesc apa la timp.");
    }

    static void intretinere(){
        System.out.println("Intretinerea in general pentru anotimpul iarna, este in crestere.");
    }
    public Bloc2(int numarApartamente, String numeleProprietarilor, String adresa, String scara) {
        this.numarApartamente = numarApartamente;
        this.numeleProprietarilor = numeleProprietarilor;
        this.adresa = adresa;
        this.scara = scara;
    }

    static int intretinerea;

    static String gunoiul;



}
