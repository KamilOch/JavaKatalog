package klasa_class.klasaWewnetrzna.FactoryPiotr;

public class Main {

    public static void main(String[] args) {

        Zwierze pies = FabrykaZwierzat.stworzPsa();
        System.out.println(pies);
        pies.dajGlos();

        Zwierze kot2 = FabrykaZwierzat.stworzKota();
        System.out.println(kot2);
        kot2.dajGlos();

        Zwierze kot = new Kot();
        System.out.println(kot);
        kot.dajGlos();

        Zwierze pies2 = FabrykaZwierzat.stworzPsaUkrytego();
        System.out.println(pies2);
        pies2.dajGlos();
    }
}
