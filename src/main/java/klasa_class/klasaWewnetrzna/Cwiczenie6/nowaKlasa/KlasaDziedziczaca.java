package klasa_class.klasaWewnetrzna.Cwiczenie6.nowaKlasa;

import klasa_class.klasaWewnetrzna.Cwiczenie6.dlaKlasy.Cwicz6Klasa;

public class KlasaDziedziczaca extends Cwicz6Klasa {


    public static void main(String[] args) {
        KlasaDziedziczaca kd = new KlasaDziedziczaca();

        KlasaDziedziczaca.TajnKlasa tk = kd.new TajnKlasa();

        tk.akuku();
        System.out.println(tk.pin);
    }
}