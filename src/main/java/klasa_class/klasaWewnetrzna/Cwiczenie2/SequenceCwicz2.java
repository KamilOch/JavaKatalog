package klasa_class.klasaWewnetrzna.Cwiczenie2;

interface Selector {
    boolean end();
    Object current();
    void next();
}

 class Sequence2 {
    private Object [] items;
    private int next = 0;
    public Sequence2(int size) { items = new Object[size]; }
    public void add(Object x) {
        if (next < items.length)
        {items[next++] = x;}
    }
    //Cwiczenie2
    private class Cwiczenie2 {
        private String tekstCwiczenia2 = " Tekst cwiczenia 2 ";

        void wyswietl (){
            System.out.println(tekstCwiczenia2);
        }
    }

    private class SequenceSelector implements Selector {
        private int i = 0;
        public boolean end() { return i == items.length; }
        public Object current() { return items[i]; }
        public void next() { if (i < items.length) {i++; }}
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence2 sequence2 = new Sequence2(10);

        for (int i = 0; i < 10; i++)
            sequence2.add(Integer.toString(i));
        Selector selector = sequence2.selector();
        while (!selector.end()) {
            System.out.println(selector.current() + " ");
            selector.next();
        }

        Sequence2.Cwiczenie2 instancjaKlasyWewCwiczenia = sequence2.new Cwiczenie2();
        instancjaKlasyWewCwiczenia.wyswietl();

    }
}