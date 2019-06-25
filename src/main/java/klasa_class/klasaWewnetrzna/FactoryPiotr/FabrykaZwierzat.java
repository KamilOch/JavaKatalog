package klasa_class.klasaWewnetrzna.FactoryPiotr;



public class FabrykaZwierzat {




static Zwierze stworzPsa (){
    return new Pies();
}

static Zwierze stworzPsaUkrytego (){
    return new Pies.PiesUkryty();
}

static Zwierze stworzKota(){
    return new Zwierze() {
           @Override
           public void dajGlos() {
               System.out.println("mial2");
           }
       };
}
 Zwierze stworzMysz (){
    return this.new Mysz();
}

    public class Mysz implements Zwierze {
        @Override
        public void dajGlos() {
            System.out.println("pipipipi");
        }
    }


    private static class Pies implements Zwierze {

        @Override
        public void dajGlos(){
            System.out.println("hauhau");
        }

        static class PiesUkryty implements Zwierze{

            @Override
            public void dajGlos() {
                System.out.println("glos uktyrego psa");
            }
        }

    }

}
