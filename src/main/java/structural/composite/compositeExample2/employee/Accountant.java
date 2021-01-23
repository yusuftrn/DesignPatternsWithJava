package structural.composite.compositeExample2.employee;

public class Accountant implements Employee {

    private int id;
    private String name;
    private double salary;

    public Accountant(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int getID() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void printOut() {
        System.out.println("----------------");
        System.out.println("ID: " + getID());
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("----------------");
    }

    @Override
    public void add(Employee employee) {
        //this is leaf. cant add or remove.
    }

    @Override
    public void remove(Employee employee) {
        //this is leaf. cant add or remove.
    }

    @Override
    public Employee getChild(int i) {
        //this is leaf. cant add or remove.
        return null;
    }
}
