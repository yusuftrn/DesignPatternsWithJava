package structural.flyweight.FlyweightExample3.characters;

public class CharacterC extends Character {

    public CharacterC(){
        this.symbol = "C";
        this.height = 100;
        this.width = 100;
        this.ascent = 68;
        this.descent = 0;
    }

    @Override
    public void Display(int pointSize) {
        this.pointSize = pointSize;
        System.out.println(this.symbol + "<pointSize " + this.pointSize + ">");
    }
}
