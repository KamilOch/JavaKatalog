package Clollections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListFunkcje {

    public static void main(String[] args) {


        Obiekt o1 = new Obiekt("obiekt1");
        Obiekt o2 = new Obiekt("obiekt2");
        Obiekt o3 = new Obiekt("obiekt3");
        Obiekt o4 = new Obiekt("obiekt4");

        List<Obiekt> obiekty = new ArrayList<Obiekt>();
        List<String> lista = new ArrayList<String>();
        lista.set(100,"ndfnDW");
        obiekty.add(o1);
        obiekty.add(o2);
        obiekty.add(o3);
        obiekty.add(o4);

        lista.add("a kuku");
        lista.clear();
        //Uwaga moja listaArray!!!

        MojaArrayList mojaArrayListObiekty = new MojaArrayList();

        mojaArrayListObiekty.add(o1);
        mojaArrayListObiekty.add(o2);
        mojaArrayListObiekty.add(o3);

        System.out.println(mojaArrayListObiekty.size());
        System.out.println(mojaArrayListObiekty.get(1));
        System.out.println(mojaArrayListObiekty.isEmpty());
        System.out.println("test");
        System.out.println(mojaArrayListObiekty.size());
        System.out.println(mojaArrayListObiekty.remove(o3));
        System.out.println(mojaArrayListObiekty.size());


    }
}
