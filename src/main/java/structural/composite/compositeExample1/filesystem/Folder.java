package structural.composite.compositeExample1.filesystem;

import java.util.Vector;

public class Folder extends FileSystemComponent {

    private Vector<FileSystemComponent> components;

    public Folder(String name) {
        super(name);
        components = new Vector<FileSystemComponent>();
    }

    public void add(FileSystemComponent c){
        components.add(c);
    }

    public void remove(FileSystemComponent c){
        components.remove(c);
    }

    @Override
    public void open() {
        System.out.println("Opening folder..");
    }

    @Override
    public void rename(String name) {
        this.name = name;
        System.out.println("Renaming folder..");
    }

    @Override
    protected void printUsingIndentation(int indentation) {
        printIndent(indentation);
        System.out.println(name);

        for(FileSystemComponent c : components){
            c.printUsingIndentation(indentation + 2);
        }

    }
}
