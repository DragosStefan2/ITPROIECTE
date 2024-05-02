package Cursuri;

public class Om {

    String nume;
    int varsta;
    float CNP;
    boolean par;

    public Om(String NumeP, int varstaP, float CNPP, boolean parP){
        this.CNP=CNPP;
        this.varsta=varstaP;
        this.nume=NumeP;
        this.par=parP;
    }
    public Om(){
        float CNP= 503024;
        String nume= " ";
    }

    int getVarsta(){
        return varsta;
    }
    void setCNP(int CNPNOU){
        this.CNP=CNPNOU;
    }

}
