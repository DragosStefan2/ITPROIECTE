package Cursuri;

public class Apartament {
    /** 4 proprietati*/
    int numarulAparamentului;
    String numeleProprietarilor;
    int etajul;

    String decomandat;
    /** getter si setter*/

    int getNumarulAparamentului(){
        return numarulAparamentului;
    }
    void setEtajul(int etajulnou){
        this.etajul = etajulnou;
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

    public Apartament(int numarulAparamentului, String numeleProprietarilor, int etajul, String decomandat) {
        this.numarulAparamentului = numarulAparamentului;
        this.numeleProprietarilor = numeleProprietarilor;
        this.etajul = etajul;
        this.decomandat = decomandat;
    }

    static int intretinerea;

    static String gunoiul;



}

