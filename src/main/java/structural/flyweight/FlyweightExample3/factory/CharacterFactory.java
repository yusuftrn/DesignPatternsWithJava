package structural.flyweight.FlyweightExample3.factory;

import structural.flyweight.FlyweightExample3.characters.Character;
import structural.flyweight.FlyweightExample3.characters.CharacterA;
import structural.flyweight.FlyweightExample3.characters.CharacterB;
import structural.flyweight.FlyweightExample3.characters.CharacterC;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    public Map<String, Character> characterMap = new HashMap<>();

    public Character getCharacter(char key){
        Character character = null;
        if(characterMap.containsKey(key)){
            character = characterMap.get(key);
        }
        else{
            switch (key){
                case 'A':
                    character = new CharacterA();
                    break;
                case 'B':
                    character = new CharacterB();
                    break;
                case 'C':
                    character = new CharacterC();
                    break;
            }
            characterMap.put(String.valueOf(key), character);
        }
        return character;
    }
}
/*
A<pointSize 11>
B<pointSize 12>
A<pointSize 13>
A<pointSize 14>
B<pointSize 15>
C<pointSize 16>
A<pointSize 17>
C<pointSize 18>
 */