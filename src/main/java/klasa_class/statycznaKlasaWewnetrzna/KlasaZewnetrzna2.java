package klasa_class.statycznaKlasaWewnetrzna;

public class KlasaZewnetrzna2 {

    public static class KlasaWewnetrzna2 {
    }

    private KlasaWewnetrzna2 instancja() {
        return new KlasaWewnetrzna2();
    }

    private static void sasycznaWewnetrznaKlasaInstancja() {
        // tak nie trzeba robic bo to przypadek statycznej klasy wewnetrznej
        KlasaZewnetrzna2 klasaZewnetrzna = new KlasaZewnetrzna2();
        KlasaZewnetrzna2.KlasaWewnetrzna2 instancja1 = klasaZewnetrzna.instancja();
        // tak mozna zrobic instancje skoro to przypadek statycznej klasy wewnetrznej
        KlasaZewnetrzna2.KlasaWewnetrzna2 instancja2 = new KlasaZewnetrzna2.KlasaWewnetrzna2();
    }



}

