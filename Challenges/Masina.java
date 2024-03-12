package Challenges;

public class Masina {
    String numele;

    String marca;

    int kilometrii;

    int caiputere;

    int getKilometrii(){
        return kilometrii;
    }

    void setNumele(String numeleNou){
        this.numele= numeleNou;
    }

    static void metodaX(){
        System.out.println("Am folosit metoda X.");
    }

    static void brand(){
        System.out.println("Brand-ul masinii este unul destul de popular.");
    }

    static void numeleCreatorului(){
        System.out.println("Numele creatorului este...");
    }

    static void intretineremasina(){
        System.out.println("Intretinerea masinii este destul de scumpa si pompoasa.");
    }

    public Masina(String numele, String marca, int kilometrii, int caiputere) {
        this.numele = numele;
        this.marca = marca;
        this.kilometrii = kilometrii;
        this.caiputere = caiputere;
    }

    static int roti;

    static boolean functionala= true;


}
