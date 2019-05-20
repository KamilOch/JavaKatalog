package klasa_class.klasaWewnetrzna.Cwiczenie3;

// to Klasa Outer
 class Outher {
     private String tekst;

     Outher (){
         tekst = " tajny tekst";
     }

    public Outher(String tekst) {
        this.tekst = tekst;
    }

    class Inner{

         public String toStringPole(){
             return tekst;
         }

    }

    public Inner returnInner (){
        return new Inner();
    }

    public static void main (String [] args){
        Outher outerClass = new Outher();
        Outher.Inner c = outerClass.returnInner();
        System.out.println(c.toStringPole());
    }
}
