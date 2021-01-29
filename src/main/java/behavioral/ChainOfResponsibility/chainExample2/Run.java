package behavioral.ChainOfResponsibility.chainExample2;

import behavioral.ChainOfResponsibility.chainExample2.operations.*;

public class Run {
    public static void main(String[] args){
        Chain chainCalc1 = new AddNumbers();
        Chain chainCalc2 = new SubtractNumbers();
        Chain chainCalc3 = new MultiplyNumbers();
        Chain chainCalc4 = new DivideNumbers();

        chainCalc1.setNextChain(chainCalc2);
        chainCalc2.setNextChain(chainCalc3);
        chainCalc3.setNextChain(chainCalc4);

        Numbers request = new Numbers(4, 2, "div");
        chainCalc1.calculate(request);

        Numbers request2 = new Numbers(8, 4, "mod");
        chainCalc1.calculate(request2);


    }
}
/*OUTPUT:
4 / 2 = 2
Only works for add, sub, mult and div operations
 */
