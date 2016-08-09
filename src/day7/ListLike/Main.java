package day7.ListLike;

import java.util.Iterator;

class sFull extends Exception{
    sFull(){
        System.out.println("Storage is full");
    }
}
public class Main {
    public static void main(String[] args) {
        Sequence s = new Sequence(10);
        s.add("Hello");
        s.add("there");
        s.add("done");
        Iterator i1 = s.iterator();
        Iterator i2 = s.iterator();
        assert i1.hasNext();
        assert i1.next().equals("Hello");
        assert i1.hasNext();
        assert i1.next().equals("there");
        assert i2.hasNext();
        assert i2.next().equals("Hello");
        assert i1.hasNext();
        assert i1.next().equals("done");
        assert i1.hasNext() == false;
        assert i2.next().equals("there");
        assert i2.next().equals("done");
        assert i2.hasNext() == false;
        for(Object o:s){System.out.println(o);}
    }

}

class Sequence<E> implements Iterable<E>{

    public Iterator<E> iterator() {
        return new SequenceIterator<E>();
    }
    public class SequenceIterator <T> implements Iterator<T>{
        private int progress  = 0;
        @Override
        public boolean hasNext() {
            return progress < c;
        }
        @Override
        public T next() {
            return (T) sq[progress++];
        }
        public void remove(){
        }

    }
    private int c = 0;
    private String[] sq;
    Sequence(int s){
        sq = new String[s];
    }
    void add(Object o){
        if(c < sq.length-1){
            sq[c++] = (String) o;
            c++;
        }else try {
            throw new sFull();
        } catch (sFull storageFull) {
            storageFull.printStackTrace();
        }
    }

}