package Cursuri;

public class Bloc {
       String strada;
       int anConstructie;
       int etaj;

       boolean lift;

       public Bloc(String stradaP, int anConstructieP, int etajP, boolean liftP){
           this.strada=stradaP;
           this.anConstructie=anConstructieP;
           this.etaj=etajP;
           this.lift=liftP;
       }
       void afiseazariscseismic(){
           System.out.println("Riscul seismic este mare.");

       }
       public int etajeleblocului(){
           System.out.println(etaj);
           return this.etaj;
       }
       /** getter & setter*/
        int getAnConstructie(){
            return anConstructie;
        }
        void setAnConstructie(int AnConstructieParametru){
            this.anConstructie= AnConstructieParametru;

        }

}
