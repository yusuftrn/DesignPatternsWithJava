package structural.proxy.proxyExample4;

import structural.proxy.proxyExample4.image.Image;
import structural.proxy.proxyExample4.image.ProxyImage;

public class Run {
    public static void main(String[] args){
        Image image = new ProxyImage("test_10mg.jpg");

        image.display();
        System.out.println();

        //image will not be loaded from disk
        image.display();
    }
}
/*
Loading: test_10mg.jpg
Displaying: test_10mg.jpg

Displaying: test_10mg.jpg
 */