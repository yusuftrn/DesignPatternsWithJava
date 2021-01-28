package structural.proxy.ProxyExample2;

import structural.proxy.ProxyExample2.company.ProxyManager;

import java.math.BigDecimal;

public class Run {
    public static void main(String[] args) throws IllegalAccessException {
        //Employee tries to reach.
        ProxyManager proxyManager = new ProxyManager("yusuf", "1234");
        try{
            BigDecimal turnOver = proxyManager.getTurnOver();
            System.out.println("Company's TurnOver: " + turnOver);

        } catch (IllegalAccessException e) {
            System.out.println("You have no permission for this.");
        }

        //Manager tries to reach.
        proxyManager = new ProxyManager("gamze", "1164");
        try{
            BigDecimal turnOver = proxyManager.getTurnOver();
            System.out.println("Company's TurnOver: " + turnOver);

        } catch (IllegalAccessException e) {
            System.out.println("You have no permission for this.");
        }
    }
}
/*
You have no permission for this.
Company's TurnOver: 1000000.0
 */