package behavioral.iteratorPattern.iteratorExample4.after;

public class Run {
    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        for (int i = 0; i < 10; i++) {
            integerBox.add(i);
        }
        // getData() has been removed.
        IntegerBox.Iterator firstItr = integerBox.getIterator();
        IntegerBox.Iterator secondItr = integerBox.getIterator();

        for (firstItr.first(); !firstItr.isDone(); firstItr.next()) {
            System.out.print(firstItr.currentValue() + " ");
        }
        System.out.println();
        System.out.println("Two simultaneous iterations: ");
        for (firstItr.first(), secondItr.first(); !firstItr.isDone(); firstItr.next(), secondItr.next()) {
            System.out.print(firstItr.currentValue() + " " + secondItr.currentValue() + " - ");
        }
    }
}
