package Challenges;

public class Contract {
    String tipContract;

    String semnatura;
    int numarpagini;
    boolean contractoficial;

    public Contract(String tipContractP, String semnaturaP,int numarpaginiP, boolean contractoficialP){
        this.tipContract=tipContractP;
        this.semnatura=semnaturaP;
        this.numarpagini=numarpaginiP;
        this.contractoficial=contractoficialP;

    }
}
