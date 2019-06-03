package klasa_class.AnonimoweKlasyWewnetrzne;
// Wywolanie konstruktora klasy bazowej


public class Parcel8 {
    public Wrapping wrapping (int x){
        //wywolanie konstruktora klasy bazowej
        return new Wrapping (x) { //przekazanie argumentu konstruktora
            public int value () {
                return super.value() *47;
                //return super.value();

            }
        }; // Wymagany średnik
    }

    public static void main(String[] args) {
        Parcel8 p = new Parcel8();
        Wrapping w = p.wrapping(10);
    }

}
