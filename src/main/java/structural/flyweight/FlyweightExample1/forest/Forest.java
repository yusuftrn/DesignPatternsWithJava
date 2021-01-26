package structural.flyweight.FlyweightExample1.forest;

import structural.flyweight.FlyweightExample1.trees.TreeFactory;
import structural.flyweight.FlyweightExample1.trees.Tree;
import structural.flyweight.FlyweightExample1.trees.TreeType;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Forest extends JFrame {
    private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, Color color, String otherTreeData){
        TreeType treeType = TreeFactory.getTreeType(name, color, otherTreeData);
        Tree tree = new Tree(x, y, treeType);
        trees.add(tree);
    }

    @Override
    public void paint(Graphics graphics) {
        for (Tree t : trees) {
            t.draw(graphics);
        }
    }
}
