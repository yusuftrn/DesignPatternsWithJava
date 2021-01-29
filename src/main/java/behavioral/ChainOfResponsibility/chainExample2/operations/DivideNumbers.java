package behavioral.ChainOfResponsibility.chainExample2.operations;

public class DivideNumbers implements Chain {

    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if(request.getCalculationWanted() == "div"){
            System.out.println(request.getNumber1() + " / " + request.getNumber2() + " = " +
                    (request.getNumber1() / request.getNumber2()));
        }
        else{
            System.out.println("Only works for add, sub, mult and div operations");
        }
    }
}
