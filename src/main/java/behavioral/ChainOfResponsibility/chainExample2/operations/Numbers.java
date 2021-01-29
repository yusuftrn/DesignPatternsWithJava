package behavioral.ChainOfResponsibility.chainExample2.operations;

public class Numbers {
    private int num1;
    private int num2;
    private String calculationWanted;

    public Numbers(int newNum1, int newNum2, String calculationWanted){
        this.num1 = newNum1;
        this.num2= newNum2;
        this.calculationWanted = calculationWanted;
    }

    public int getNumber1(){
        return num1;
    }

    public int getNumber2(){
        return num2;
    }

    public String getCalculationWanted(){
        return calculationWanted;
    }
}
