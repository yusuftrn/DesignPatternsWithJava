package behavioral.iteratorPattern.iteratorExample4.after;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class IntegerBox {
    private List<Integer> integerList = new ArrayList<>();

    public class Iterator{
        private IntegerBox integerBox;
        private java.util.Iterator iterator;
        private int value;

        public Iterator(IntegerBox integerBox){
            this.integerBox = integerBox;
        }

        public void first(){
            iterator = integerBox.integerList.iterator();
            next();
        }

        public void next(){
            try{
                value = (Integer) iterator.next();
            }catch (NoSuchElementException ex){
                value = -1;
            }
        }

        public boolean isDone() {
            return value == -1;
        }

        public int currentValue() {
            return value;
        }
    }

    public void add(int in) {
        integerList.add(in);
    }

    public Iterator getIterator() {
        return new Iterator(this);
    }
}
