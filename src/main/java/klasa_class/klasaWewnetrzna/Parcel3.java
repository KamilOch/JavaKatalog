package klasa_class.klasaWewnetrzna;

public class Parcel3 {
    class Contents {
        private int i = 11;
        public int value() {
            return i;
        }
    }

    class Destination {
        private String label;
        Destination ( String wheteTo){
            label = wheteTo;
        }
        String readLabel (){
            return label;
        }
    }

    public static void main (String [] args){

        Parcel3 p = new Parcel3();
        // Do utworzenia klasy wewnetrznej konieczny jest egzemplarz klasy zewnetrznej
        Parcel3.Contents c = p.new Contents();
        Parcel3.Destination d = p.new Destination("Tasmania");

    }
}
