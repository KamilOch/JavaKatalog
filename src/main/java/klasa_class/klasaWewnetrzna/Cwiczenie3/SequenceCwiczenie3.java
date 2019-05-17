package klasa_class.klasaWewnetrzna.Cwiczenie3;

interface Selector {
    boolean end();
    Object current();
    void next();
}

 class Sequence3 {
    private String tajnyTekst;
    private Object [] items;
    private int next = 0;
    public Sequence3(int size) {
        tajnyTekst = "hokus pokus";
        items = new Object[size];
    }
    public void add(Object x) {
        if (next < items.length)
        {items[next++] = x;}
    }

    private class SequenceSelector implements Selector {
        private int i = 0;
        public boolean end() { return i == items.length; }
        public Object current() { return items[i]; }
        public void next() { if (i < items.length) {i++; }}
        public String wyswietlTekst(){ return tajnyTekst; }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence3 sequence = new Sequence3(10);
        for (int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.println(selector.current() + " ");
            selector.next();

        }
        //jeszcze nie dziala mi cwiczenie3
        System.out.printl(selector.wyswietlTekst());
    }
}