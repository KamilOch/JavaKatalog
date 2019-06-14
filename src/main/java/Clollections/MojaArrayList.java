package Clollections;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

public class MojaArrayList <E>extends AbstractList<E>
        implements List<E>, RandomAccess, Cloneable, java.io.Serializable{

    private int size;

    transient Object[] elementData; // non-private to simplify nested class access

    private String outOfBoundsMsg(int index) {
        return "Index: "+index+", Size: "+this.size;
    }

    private void rangeCheck(int index) {
        if (index < 0 || index >= this.size)
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }

    E elementData(int index) {
        return (E) elementData[index];
    }

    @Override
    public E get(int index) {
        rangeCheck(index);
        return elementData(index);
    }

    @Override
    public int size() {
        return size;
    }

}
