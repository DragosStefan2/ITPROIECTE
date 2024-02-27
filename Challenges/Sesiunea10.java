package Challenges;

public class Sesiunea10 {

   /** exemplu break*/
    public static void main(String[] args) {
        DENUMIRE_FOR:
        for(int i=0; i <=10; i++){
            System.out.println(i);
            /** PAR*/
            if (i%2==0){
                System.out.println("Am gasit numar par: " + i);
                break;

            }

        }
        /** exemplu continue*/
        DENUMIRE_FOR:
        for(int i=0; i <=10; i++){
            System.out.println(i);
            /** PAR*/
            if (i%2==0){
                System.out.println("Am gasit numar par: " + i);
                continue;

            }
            /** nu mai ajunge acolo dupa continue*/
          System.out.println("Am trecut de continue");
        }
    }
}
