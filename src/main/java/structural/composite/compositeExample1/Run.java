package structural.composite.compositeExample1;

import structural.composite.compositeExample1.filesystem.Folder;
import structural.composite.compositeExample1.filesystem.File;
public class Run {
    public static void main(String[] args){

        Folder root = new Folder("GOF");
        Folder folder1 = new Folder("Creational");
        Folder folder2 = new Folder("Structural");
        Folder folder3 = new Folder("Behavioral");

        root.add(folder1);
        root.add(folder2);
        root.add(folder3);

        folder1.add(new File("singleton.txt"));
        folder1.add(new File("prototype.txt"));

        folder2.add(new File("adapter.txt"));
        folder2.add(new File("composite.txt"));
        folder2.add(new File("decorator.txt"));

        folder3.add(new File("observer.txt"));
        folder3.add(new File("strategy.txt"));

        root.add(new File("cover.jpg"));

        root.print();

    }
}
/*
GOF
  Creational
    singleton.txt
    prototype.txt
  Structural
    adapter.txt
    composite.txt
    decorator.txt
  Behavioral
    observer.txt
    strategy.txt
  cover.jpg
 */