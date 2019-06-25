package Clollections;

import java.util.*;

public class MojaArrayList implements List<Object>{

    private Obiekt [] mojeObiekty;
    private int wielkosc = 0;

    public MojaArrayList() {
     mojeObiekty = new Obiekt[1000];
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
        mojeObiekty[wielkosc] = (Obiekt) o;
        wielkosc++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        boolean czyZnalazl=false;

        for(int i=0; i<mojeObiekty.length;i++){
            if(o.equals(mojeObiekty[i])){
                mojeObiekty[i] = null;
                wielkosc--;
                czyZnalazl = true;
                break;
            }
        }
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
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
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
