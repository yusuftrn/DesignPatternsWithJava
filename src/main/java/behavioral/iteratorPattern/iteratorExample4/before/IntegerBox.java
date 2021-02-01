package behavioral.iteratorPattern.iteratorExample4.before;

import java.util.ArrayList;
import java.util.List;

public class IntegerBox {
    private final List<Integer> integerList = new ArrayList<>();

    public void add(int data){
        integerList.add(data);
    }

    public List getData(){
        return integerList;
    }
}
