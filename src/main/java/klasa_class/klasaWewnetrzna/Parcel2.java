package klasa_class.klasaWewnetrzna;

public class Parcel2 {
    class Contents{
        private int i = 11;
        public int value(){
            return i;
        }
    }

    class Destination {
        private String label;
        Destination (String whereTo){
            label=whereTo;
        }
        String readLabel(){
            return label;
        }
    }
    public Destination to (String s){
        return new Destination(s);
    }
    public Contents contents (){
        return new Contents();
    }

    public void ship (String dest){
        Contents c = contents();
        Destination d = to (dest);
        System.out.println(d.readLabel());
        // dodalem sam aby dostac sie do wartoci i klasy wewnetrznej Contents
        System.out.println(c.value());
    }

    public static void main (String[] args){
        Parcel2 p = new Parcel2();
        p.ship("Tasmania");


        Parcel2 q = new Parcel2();
        //Definicje referencji klas wewnetrznych
        Parcel2.Contents c = q.contents();
        Parcel2.Destination d = q.to("Borneo");
        // moj kod dodany do ksiazkowego aby wyswietlic inny kurs
        System.out.println("Parcel2 " + d.readLabel());
        System.out.println("Parcel2 " + c.value());

    }
}
