package structural.proxy.ProxyExample2.company;

import structural.proxy.ProxyExample2.employees.Employee;
import structural.proxy.ProxyExample2.employees.EmployeeUtil;

import java.math.BigDecimal;

public class ProxyManager implements CompanyDetails {

    private Manager manager;

    private String uName;
    private String uPass;

    public ProxyManager(String uName, String uPass) {
        this.manager = new Manager();
        this.uName = uName;
        this.uPass = uPass;
    }

    private boolean isManager(){
        boolean isManager = false;

        boolean isEmployeeValid = EmployeeUtil.isEmployeeValid(uName, uPass);
        if(isEmployeeValid){
            Employee employeeByUName = EmployeeUtil.getEmployeeByUName(uName);
            isManager = employeeByUName.isManager();
        }
        return isManager;
    }

    @Override
    public BigDecimal getTurnOver() throws IllegalAccessException {
        boolean isManager =  isManager();
        if(isManager){
            return manager.getTurnOver();
        }
        else{
            throw new IllegalAccessException();
        }
    }
}
