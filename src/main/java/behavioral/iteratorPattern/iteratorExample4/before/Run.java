package behavioral.iteratorPattern.iteratorExample4.before;


import java.util.Collection;

public class Run {
    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        for(int i=0; i<10; i++){
            integerBox.add(i);
        }

        Collection integerList = integerBox.getData();
        for(Object i : integerList){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Size of data is: " + integerList.size());
        System.out.println("Data clearing..");
        integerList.clear();
        integerList = integerBox.getData();
        System.out.println("Size of data is: " + integerList.size());
    }
}

/*
0 1 2 3 4 5 6 7 8 9
Size of data is: 10
Data clearing..
Size of data is: 0
 */