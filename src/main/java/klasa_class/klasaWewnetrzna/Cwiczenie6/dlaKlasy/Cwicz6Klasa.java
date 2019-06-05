package klasa_class.klasaWewnetrzna.Cwiczenie6.dlaKlasy;

import klasa_class.klasaWewnetrzna.Cwiczenie6.dlaInterf.InterfaceCwi6;

public class Cwicz6Klasa {
    protected class TajnKlasa implements InterfaceCwi6 {

        private int pin = 123456;

        @Override
        public void akuku() {
            System.out.println("akuku");
        }
    }
}
