package structural.proxy.proxyExample3;

import structural.proxy.proxyExample3.internet.Internet;
import structural.proxy.proxyExample3.internet.ProxyInternet;

public class Run {
    public static void main(String[] args){
        Internet internet = new ProxyInternet();
        try{
            internet.connectTo("google.com");
            internet.connectTo("youtube.com");
            internet.connectTo("facebook.com");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
