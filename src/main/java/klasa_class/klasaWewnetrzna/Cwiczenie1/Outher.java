package klasa_class.klasaWewnetrzna.Cwiczenie1;

// to Klasa Outer
public class Outher {
    class Inner{
    }

    public Inner returnInner (){
        return new Inner();
    }

    public static void main (String [] args){
        Outher outerClass = new Outher();
        Outher.Inner c = outerClass.returnInner();
    }
}
