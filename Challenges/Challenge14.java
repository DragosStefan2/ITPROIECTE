package Challenges;

public class Challenge14 {
    public static void main(String[] args) {
        Bloc2.metodaX();
        Bloc2.apa();
        Bloc2.intretinere();
        Bloc2.oameniPlata();

        Bloc2 Ceausescu= new Bloc2(6, "Vasilescu", "Aleea Arinis", "B2");

        Apartament.metodaX();
        Apartament.apa();
        Apartament.intretinere();
        Apartament.oameniPlata();

        Apartament Niculescu= new Apartament(23, "Militaru", 3, "Nu este");

        Masina.brand();
        Masina.intretineremasina();
        Masina.metodaX();
        Masina.numeleCreatorului();

        Masina BMW= new Masina("Ariton Bogdan", "F30", 3000, 285);

    }
}
