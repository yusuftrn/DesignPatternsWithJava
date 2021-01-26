package structural.flyweight.FlyweightExample3;

import structural.flyweight.FlyweightExample3.characters.Character;
import structural.flyweight.FlyweightExample3.factory.CharacterFactory;

public class Run {

    public static void main(String[] args){
        String document = "ABAABCAC";
        char[] chars = document.toCharArray();

        CharacterFactory factory = new CharacterFactory();

        //extrinsic state
        int pointSize = 10;

        for (char c: chars) {
            pointSize++;
            Character character = factory.getCharacter(c);
            character.Display(pointSize);
        }
    }
}
