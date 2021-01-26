package structural.flyweight.FlyweightExample3.characters;

public abstract class Character {
    protected String symbol;
    protected int width;
    protected int height;
    protected int ascent;
    protected int descent;
    protected int pointSize;

    public abstract void Display(int pointSize);
}
