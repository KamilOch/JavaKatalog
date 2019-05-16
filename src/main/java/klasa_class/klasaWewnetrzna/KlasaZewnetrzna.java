package klasa_class.klasaWewnetrzna;

//klasa zewnetrzna
public class KlasaZewnetrzna {
    //klasa wewnetrzna
    public class KlasaWewnetrzna {

    }

    public KlasaWewnetrzna instancja(){
        return new KlasaWewnetrzna();
    }

    private static void instancjaKlasyWewnetrznej() {
        KlasaZewnetrzna klasaZewnetrzna = new KlasaZewnetrzna();
        // tak
        KlasaZewnetrzna.KlasaWewnetrzna instancja1 = klasaZewnetrzna.instancja();
        // lub tak
        KlasaZewnetrzna.KlasaWewnetrzna instancja2 = klasaZewnetrzna.new KlasaWewnetrzna();
    }


}
