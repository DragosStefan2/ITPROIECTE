package Cursuri;

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
    public Contract(){
        String tipContract= " ";
        String semnatura= " ";
        int numarpagini= 0;
        boolean contractoficial= true;
    }

    int getNumarpagini(){
        return numarpagini;
    }
    void setTipContract(String ContractBazat){
        this.tipContract=ContractBazat;
    }
}
