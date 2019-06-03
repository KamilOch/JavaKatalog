package klasa_class.AnonimoweKlasyWewnetrzne;
// Zwracanie eqzemplarza anonimowej kasy wewnetrznej


public class Parcel7 {

     public Contents contents() {
        return new Contents() { //wstawianie definicji klasy
            private int i = 11;
            public int value (){
                return i;
            }
        }; //Tu wymagany srednik
    }
    
    public static void main (String [] args) {
        Parcel7 p = new Parcel7();
        Contents c = p.contents();
    }
}
