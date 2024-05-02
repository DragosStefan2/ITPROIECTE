package Cursuri.curs25;

public class Main {
    public static void main(String[] args) {
        /** Obiect de tip Car*/
        Car car1= new Car();

        /**Clasa anonima => clasa care extinde( extends) clasa Car*/

        Car carAnonim= new Car(){
            String nume;
            public void metodaDinClasaAnonima(){
                System.out.println("Am apelat metodaDinClasaAnonima()");
            }

            public void functioneaza(){
                System.out.println("Functioneaza bine.");
            }

        };

    }
}
