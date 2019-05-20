package klasa_class.klasaWewnetrzna;

public class DotThis {
    void f(){
        System.out.println("DotThis.f()");
    }
    public class Inner {
        public DotThis outer(){
            return DotThis.this;
            //zwykle "this" odnosiło by się do obiektu klasy wewnetrznej
        }
    }

    public Inner inner (){
        return new Inner();
    }

    public static void main (String [] args){
        DotThis dt = new DotThis();
        DotThis.Inner dti = dt.inner();
        dti.outer().f();
    }

}
