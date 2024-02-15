package Curs567;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("Start");
//        System.out.println(3 == 3.0);
        /**CREARE OBIECT => instantiere*/
        Animale animalobiect = new Animale();
        Animale pisica= new Animale();
        Animale caine= new Animale();
        /** Nu se mai creeaza o noua zona de memorie */
        Animale soarece= pisica;

        System.out.println(soarece==pisica);
        System.out.println(caine==soarece);

        int numarMasini= 11;
        if(numarMasini==10){
            System.out.println("Ai 10 masini.");
        } else if (numarMasini==11){
            System.out.println("Ai 10 masini.");
        }

    }
}
