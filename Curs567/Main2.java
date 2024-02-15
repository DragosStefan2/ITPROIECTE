package Curs567;

public class Main2 { //Sesiunea 6
    public static void main(String[] args) {
        int numarZile = 10;
        int numarziledinluna = numarZile * 3;
        int y = 3 + 6 * --numarZile; //int y = 3+6 * (numarZile - 1 )
        int y2 = 3 + 6 * numarZile--;
        int y3 = 3 + 6 * numarZile++;
        System.out.println(y);
        System.out.println(y2);
        System.out.println(y3);
        System.out.println(numarziledinluna);

        //Bolean
        boolean areMasina = true;

        System.out.println(2>numarZile || numarZile<3);
        long d= 231232453;
        System.out.println(d);
    }
}
