package structural.flyweight.FlyweightExample1;

import structural.flyweight.FlyweightExample1.forest.Forest;

import java.awt.*;

public class Run {

    static int CANVAS_SIZE = 900;
    static int TREES_TO_DRAW = (int) 1e6;
    static int TREE_TYPES = 3;

    public static void main(String[] args){

        Forest forest = new Forest();

        for(int i=0; i<Math.floor(TREES_TO_DRAW/TREE_TYPES); i++){
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Summer Oak", Color.MAGENTA, "Oak texture stub");
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Autumn Oak", Color.RED, "Autumn Oak texture stub");
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Winter Oak", Color.WHITE, "White Oak texture stub");
        }

        forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
        forest.setVisible(true);

        System.out.println(TREES_TO_DRAW + " trees drawn");
        System.out.println("-----------");
        System.out.println("Memory Usage:" );
        System.out.println("Tree size(8 bytes) * " + TREES_TO_DRAW);
        System.out.println("TreeTypes size (~30 bytes) * " + TREE_TYPES + "");
        System.out.println("-----------");
        System.out.println("Total: " + ((TREES_TO_DRAW * 8 + TREE_TYPES * 30) / 1024 / 1024) +
                "MB (instead of " + ((TREES_TO_DRAW * 38) / 1024 / 1024) + "MB)");
    }

    private static int random(int min, int max) {
        return min + (int)(Math.random()*((max-min)+1));
    }
}
/*
100000 trees drawn
-----------
Memory Usage:
Tree size(8 bytes) * 100000
TreeTypes size (~30 bytes) * 3
-----------
Total: 0MB (instead of 3MB)
 */