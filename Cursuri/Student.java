package Cursuri;

public class Student {
    int legitimatie;
    String profilfacultate;
    String uniforma;
    String nume;

    public Student(int legitimatieP, String profilfacultateP, String uniformaP,String numeP ){
        this.legitimatie=legitimatieP;
        this.profilfacultate=profilfacultateP;
        this.uniforma=uniformaP;
        this.nume=numeP;
    }
    public Student(){
        String nume= " ";
        String profilfacultate= " ";
    }
    String getNume(){
        return nume;
    }
    void setLegitimatie(int LegitimatiaNoua){
        this.legitimatie=LegitimatiaNoua;
    }

}
