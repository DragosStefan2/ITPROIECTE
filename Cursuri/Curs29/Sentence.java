package Cursuri.Curs29;


import java.util.Scanner;

public class Sentence {
    /**--Given a sentence, count how many words in the sentence have more than three characters.
     * You can consider a word to be a sequence of characters separated by spaces.
     *You can use method split()*/

    public static int splitter(String propozitie){
        String [] words=propozitie.split(" ");
        int counter=0;
        for(String cuvant: words){
            if(cuvant.length()>=3){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter sentence: ");
        String denumire= sc.nextLine();

        System.out.println("Words that contains more than 3 characters: " + splitter(denumire));


    }

}
