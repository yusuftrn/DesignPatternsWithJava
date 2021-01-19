package abstractfactory2.colors;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Red was filled");
    }
}
