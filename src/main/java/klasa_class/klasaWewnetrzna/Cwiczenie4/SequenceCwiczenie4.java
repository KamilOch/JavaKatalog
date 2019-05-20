package klasa_class.klasaWewnetrzna.Cwiczenie4;

interface Selector {
    boolean end();
    Object current();
    void next();
}

public class SequenceCwiczenie4 {
    private Object [] items;
    private int next = 0;
    public SequenceCwiczenie4(int size) { items = new Object[size]; }
    public void add(Object x) {
        if (next < items.length)
        {items[next++] = x;}
    }

    private class SequenceSelector implements Selector {
        private int i = 0;
        public boolean end() { return i == items.length; }
        public Object current() { return items[i]; }
        public void next() { if (i < items.length) {i++; }}

        // Cwiczenie 4
        public SequenceCwiczenie4 zwracaReferencjeObiektuKlasyZewnetrznej (){
            return SequenceCwiczenie4.this;
        }


    }

    public Selector selector() {
        return new SequenceCwiczenie4.SequenceSelector();
    }

    public static void main(String[] args) {
        SequenceCwiczenie4 sequence = new SequenceCwiczenie4(10);
        for (int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.println(selector.current() + " ");
            selector.next();
        }
    }
}