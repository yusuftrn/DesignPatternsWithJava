package behavioral.iteratorPattern.iteratorExample3.iterator;

public interface Iterator {

    //indicates whether there are more elements to iterate over
    boolean hasNext();

    //returns the next elements
    Object next();
}
