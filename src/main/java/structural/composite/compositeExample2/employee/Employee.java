package structural.composite.compositeExample2.employee;

public interface Employee {

    public int getID();
    public String getName();
    public double getSalary();
    public void printOut();
    public void add(Employee employee);
    public void remove(Employee employee);
    public  Employee getChild(int i);
}
