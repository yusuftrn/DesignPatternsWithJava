package behavioral.ChainOfResponsibility.chainExample2.operations;

public interface Chain {
    public void setNextChain(Chain nextChain);

    public void calculate(Numbers request);
}
