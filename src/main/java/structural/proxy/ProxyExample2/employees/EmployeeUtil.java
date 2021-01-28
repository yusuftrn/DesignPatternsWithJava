package structural.proxy.ProxyExample2.employees;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class EmployeeUtil {

    public static List<Employee> getEmployeeList(){
        Employee yusuf = new Employee("yusuf", "1234", false);
        Employee mehmet = new Employee("mehmet", "4155", false);
        Employee gamze = new Employee("gamze", "1164", true);
        Employee murat = new Employee("murat", "1324", false);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(yusuf);
        employeeList.add(mehmet);
        employeeList.add(gamze);
        employeeList.add(murat);
        return employeeList;
    }

    public static Map<String, Employee> getUNameEmployeeMap(){
        List<Employee> employeeList = getEmployeeList();
        Map<String, Employee> mp = new LinkedHashMap<>();
        for(Employee e : employeeList){
            mp.put(e.getuName(), e);
        }
        return mp;
    }

    public static Employee getEmployeeByUName(String uName){
        Map<String, Employee> mp = getUNameEmployeeMap();
        Employee employee = mp.get(uName);
        return employee;
    }

    public static boolean isEmployeeValid(String uName, String uPass) {
        boolean isEmployeeValid = false;
        Employee employee = getEmployeeByUName(uName);
        if(employee != null){
            isEmployeeValid = employee.getuPass().equals(uPass);
        }
        return isEmployeeValid;
    }
}
