package creational.prototypePattern.prototype2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunPrototype {
    public static void main(String[] args) throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Employee Id: ");
        int employeeID = Integer.parseInt(br.readLine());

        System.out.print("Enter Employee Name: ");
        String employeeName = br.readLine();

        System.out.print("Enter Employee Designation: ");
        String employeeDesignation = br.readLine();

        System.out.print("Enter Employee Address: ");
        String employeeAddress = br.readLine();

        System.out.print("Enter Employee Salary: ");
        double employeeSalary = Double.parseDouble(br.readLine());
        System.out.print("\n");

        System.out.println("Employee Records of Corporation");
        //Created employee1 with commandLine input, employee2 cloned from employee1.
        EmployeeRecord employee1 = new EmployeeRecord(employeeID,employeeName,
                employeeDesignation,employeeSalary,employeeAddress);
        employee1.showRecord();
        EmployeeRecord employee2 = (EmployeeRecord) employee1.getClone();
        employee2.showRecord();
    }
}
/* OUTPUT:
 * 1	Yusuf	Designer	122.0	Istanbul
 * 1	Yusuf	Designer	122.0	Istanbul
 */
