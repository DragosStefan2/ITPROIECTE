package Cursuri;

import java.util.Arrays;

public class Sesiune13 {
    public static void main(String[] args){
//        Random random = new Random();
//        System.out.println(random.nextInt(1, 100));

//        Scanner scanner= new Scanner(System.in);
//        int numarUtilizator= scanner.nextInt();
//        System.out.println("Numarul primit este " + numarUtilizator);
        /** Math*/
//        Math math= new Math();
//        int numarulMaxim= Math.max(1,30);
//        System.out.println(numarulMaxim);
//        int numarul= Math.divideExact(1,30);
//        System.out.println(numarul);
        int [] numbers= new int[3];
        int [] numbers2= new int[] {10, 20, 30};
        int numarelemente=numbers2.length;

        System.out.println(numarelemente);
        String[] listaDeFructe = { "Mar", "Banana", "Capsuni"};
        System.out.println(listaDeFructe[1]);
        int [][] numarelementeMatrice={{1,2},{3,4}, {5,6}};
        System.out.println(numarelementeMatrice[0][0]);
        for(int index = 0; index < listaDeFructe.length; index++){
            System.out.println(listaDeFructe[index].replaceAll("Banana","Banane"));
       }
//        for(String Fruct : listaDeFructe){
//            System.out.println(Fruct + "FOR");
//
//        }
        String[] listaCopiatFructe= Arrays.copyOfRange(listaDeFructe, 0, 3);
        for(String fructcopiat : listaCopiatFructe){
            System.out.println(fructcopiat);
        }

    }
}
