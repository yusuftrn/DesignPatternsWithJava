package structural.composite.compositeExample2;

import structural.composite.compositeExample2.employee.Accountant;
import structural.composite.compositeExample2.employee.BankManager;
import structural.composite.compositeExample2.employee.Cashier;
import structural.composite.compositeExample2.employee.Employee;

public class Run {

    public static void main(String[] args){
        Employee e1 = new Cashier(1, "Yusuf Arman", 2500);
        Employee e2 = new Cashier(2, "Murat Kazak", 2700);
        Employee e3 = new Accountant(3, "Kemal Murat", 2500);

        Employee manager = new BankManager(100, "Yusuf Turan", 99990);

        //Manager contains all accountant and cashier accounts. Composite..
        manager.add(e1);
        manager.add(e2);
        manager.add(e3);

        manager.printOut();
    }
}
/*
----------------
ID: 100
Name: Yusuf Turan
Salary: 99990.0
----------------
----------------
ID: 1
Name: Yusuf Arman
Salary: 2500.0
----------------
----------------
ID: 2
Name: Murat Kazak
Salary: 2700.0
----------------
----------------
ID: 3
Name: Kemal Murat
Salary: 2500.0
----------------

 */