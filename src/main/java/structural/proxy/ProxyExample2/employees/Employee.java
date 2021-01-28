package structural.proxy.ProxyExample2.employees;

public class Employee {
    private String uName;
    private String uPass;
    private boolean isManager;

    public Employee(String uName, String uPass, boolean isManager) {
        this.uName = uName;
        this.uPass = uPass;
        this.isManager = isManager;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPass() {
        return uPass;
    }

    public void setuPass(String uPass) {
        this.uPass = uPass;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }
}
