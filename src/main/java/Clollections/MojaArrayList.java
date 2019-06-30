package Clollections;

import java.util.*;

public class MojaArrayList implements List<Object>{

    private Object [] mojeObiekty;
    private int wielkosc = 0;

    private void dopasujWielkośćListy( int wymaganaWielkoscListy) {

        if (wymaganaWielkoscListy >= mojeObiekty.length-1) {
            Object[] tempMojeObiekty = new Object[wymaganaWielkoscListy + 10];
            for (int i = 0; i < mojeObiekty.length; i++) {
                tempMojeObiekty[i] = mojeObiekty[i];
            }
            mojeObiekty = tempMojeObiekty;
        }
    }
    public MojaArrayList() {
     this(10);
    }

    public MojaArrayList(int initialCapacity) {
     mojeObiekty = new Obiekt[initialCapacity];
    }
    @Override
    public int size() {
        return wielkosc;
    }

    @Override
    public boolean isEmpty() {
        if(wielkosc !=0){
            return false;
        } else
        return true;
    }

    @Override
    public boolean contains(Object o) {
        boolean czyZawiera = false;
        for(int i=0; i<mojeObiekty.length;i++){
            if(o.equals(mojeObiekty[i])){
                czyZawiera = true;
                break;
            }
        }
        return czyZawiera;
    }

    @Override
    public Iterator<Object> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Object o) {

        dopasujWielkośćListy(wielkosc);
        mojeObiekty[wielkosc] = o;
        wielkosc++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        boolean czyZnalazl=false;

        for(int i=0; i<mojeObiekty.length;i++){
            if(o.equals(mojeObiekty[i])){
                mojeObiekty[i]=null;

                for (int j=i; j<mojeObiekty.length-1;j++){
                    //while(mojeObiekty[(j+1)] != null) {
                    if(mojeObiekty[(j+1)]==null) {
                        break;
                    } else mojeObiekty[j] = mojeObiekty[j + 1];
                }

                wielkosc--;
                czyZnalazl = true;
                break;
            }
        }
        dopasujWielkośćListy(wielkosc);
        return czyZnalazl;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        mojeObiekty = new Obiekt[1000];
        wielkosc = 0;
    }

    @Override
        public Object get(int index) {
            return mojeObiekty[index];
    }

    @Override
    public Object set(int index, Object element) {

        dopasujWielkośćListy(index);
        wielkosc=index+1;
        mojeObiekty [index] = element;
        return mojeObiekty[index] ;
    }

    @Override
    public void add(int index, Object element) {
        dopasujWielkośćListy(index);
        if(index<wielkosc){
           for(int i = wielkosc ; i>index ; i--) {
               mojeObiekty[i] = mojeObiekty[i-1];
           }
           wielkosc +=1;
           mojeObiekty[index] = element;
        }
        else mojeObiekty[index]= element;
    }

    @Override
    public Object remove(int index) {
        Object kasowanyObiekt = mojeObiekty[index];
        mojeObiekty[index] = null;
        wielkosc--;
        for (int i=index; i < wielkosc ;i++){
            mojeObiekty[i] = mojeObiekty[i+1];
        }
        dopasujWielkośćListy(wielkosc);
        return kasowanyObiekt;
    }

    @Override
    public int indexOf(Object o) {
        int index=-1;
        for (int i=0; i<mojeObiekty.length; i++ ){
            if (o.equals(mojeObiekty[i])){
                index=i;
                break;
            }
        }
        return index;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Object> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Object> listIterator(int index) {
        return null;
    }

    @Override
    public List<Object> subList(int fromIndex, int toIndex) {
        return null;
    }
}
