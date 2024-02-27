package Challenges;

public class Challenge10 {
    public static void main(String[] args){
        Bloc Ceausescu= new Bloc("Mihai Eminescu", 1975,4,true);
        Bloc Nou= new Bloc("Aleea Arinis", 2015, 6,false);
        if (Ceausescu.anConstructie>2000 && Nou.anConstructie>2000){
            System.out.println("Blocurile sunt ambele noi.");
        } else if(Ceausescu.anConstructie<2000 && Nou.anConstructie>2000){
            System.out.println("Al doilea bloc prezentat este nou.");
        }
        else{
            System.out.println("Blocurile nu sunt noi.");
        }

        Nou.afiseazariscseismic();
        Nou.etajeleblocului();
    }
}
